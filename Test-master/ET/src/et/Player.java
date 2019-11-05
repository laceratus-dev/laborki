package et;

import java.util.Random;

public abstract class Player {
    private Random dice = new Random();
    
    private String name = "Anonim";
    
    public Player(){
    }
    
    public Player(String name){
            setName(name);
    }
    public void setName(String name){
    if (name != null && !name.isEmpty()){           
// name.lengh() != 0 || name.equals("")         
        this.name = name;
        }
        else{
            throw new IllegalArgumentException();
            // System.err.println("Imie nie moze byc null!");
        }
       
    }
    
    public String getName(){
    return name;
    }
    
    public abstract int guess();
  
}
    