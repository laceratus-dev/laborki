package game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {

    private List<Player> players = new ArrayList();    
    
    private Random dice = new Random(); //losowanie

       
//NIE POZWALA NA DODANIE GRACZA O TEJ SAMEJ NAZWIE  
/*    public void addPlayer(Player player){
        boolean checkNames=true;
        for(Player checking : players){
            if(checking.getName().equals(player.getName())){    //jesli imiona sa te same, checkNames jest false
                checkNames=false;
            }
        }
        if(checkNames)players.add(player);      //jesli checkNames jest false, nowy gracz nie zostatnie dodany
    }
*/

//DODAJE GRACZU NOWA NAZWE (dodaje i zmienia numerek na koncu nazwy)
    public void addPlayer(Player player){
        boolean checkNames=true;
        for(Player checking : players){
            if(checking.getName().equals(player.getName())){    //jesli imiona sa te same
                checkNames=false;
                int ilenumerow=1;
                    while(player.getName().matches("^[A-Za-z~.0-9]{1,}[A-Za-z~.]{1,}[0-9]{"+ilenumerow+",}$")){ //sprawdza ile jest numerow na koncu nazwy
                        ilenumerow++;
                    }
                ilenumerow--;
                int numer=1;
                int strlen = player.getName().length();
                if(ilenumerow>0){   //jesli sa jakies numery, wyciagnij je ze stringa do inta
                    numer = Integer.parseInt(player.getName().substring(strlen-ilenumerow, strlen));
                    numer++;       //inkrementuj numer, ustaw nowa nazwe graczowi i sprawdz jeszcze raz czy nazwy sie zgadzaja
                }
                String newname = player.getName().substring(0, strlen-ilenumerow);
                newname += numer;
                player.setName(newname);
                addPlayer(player);
                break;
            }
        }
        if(checkNames) players.add(player);      //jesli checkNames jest false, nowy gracz nie zostatnie dodany
    }


    
    public void removePlayer(String name){
        for(Player checking : players){
            if(checking.getName().equals(name)){    //jesli imiona sie zgadzaja, usun gracza z listy
                players.remove(checking);
                break;
            }
        }
    }
    
    public void printPlayers(){
        System.out.println("Gracze:");        
        for(Player print : players){
            System.out.println(print.getName());
        }
        System.out.println("--------------------");
    }
    
    public void play(){    
        int number; //wylosowana liczba
        int guess = -1; //liczba wybrana przez graczy
        
        do {
            number = dice.nextInt(6) + 1;
            System.out.println("Wylosowano: " + number);
            
            for(Player player : players){
                guess = player.guess();
                System.out.println(player.getName() + " odgaduje: " + guess);

                if(guess != number) {
                    System.out.println("Źle!");
                }else{
                    System.out.println("Brawo!");
                }            
            }
        System.out.println("--------------------");
        } while(number != guess);
        

    }
        
}


