
package rk;

import java.util.Random;

public class Player {
    private Random dice = new Random();
    private String name ="anonim";
    
    public void setName(String name){
        if (name != null && !name.isEmpty()){           
        this.name = name;
        }
        else{
            System.out.println("Imie nie moze byc null/puste!");
        }
        
        
    }
    
    Player(){

    }
    
    
    Player(String imie){
        setName(imie);
    }
     
    
    public String getName(){
        return name;
    }
    
    public int guess(){ 
        return dice.nextInt(6) + 1;
    }
}
