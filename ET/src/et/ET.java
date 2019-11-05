
package et;

import java.util.Random;

public class ET {

    public static void main(String[] args) {
        int number, guess;
	    Random dice = new Random();
            
/*          if(true)           
                player = new Player();
            else
                player = new PlayerHuman();
*/          
            Player player = new PlayerComp();
            try{
                player.setName("!!!!"); 
            } catch (IllegalArgumentException ex) {
                System.err.println("Błąd!"+ ex.getMessage());
            }
            
            
            
	    do{

	        number = dice.nextInt(6) + 1;
                System.out.println("Wylosowana: " + number);

                guess = player.guess();
                System.out.println("Odgadywana przez gracza o imieniu: " + player.getName() + " to: "  + guess);

                if(number != guess)
                System.out.println("Sprobuj ponownie!!");
        }
	    while(number != guess);
        System.out.println("Brawo!");


    }
}
 