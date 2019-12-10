package game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Player p1 = new PlayerComp("leet");
        Player p2 = new PlayerComp("leet");
        Player p3 = new PlayerComp("leet");
       // Player p3 = new PlayerComp("usunmnie");
        
        game.addPlayer(p1);
        game.addPlayer(p2);
        game.addPlayer(p3);
        game.printPlayers();
        game.removePlayer("usunmnie");
        game.printPlayers();
        game.play();

    }    
}