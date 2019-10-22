package rk;

import java.util.Random;

public class RK {
 
    public static void main(String[] args) {

	    int number, guess;
	    Random dice = new Random();
            
            Player player = new Player("zdzichu");
            //player.setName("");
            
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
