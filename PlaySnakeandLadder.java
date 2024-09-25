import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
//this is a cooment for git purpose
public class PlaySnakeandLadder {
    public static void main(String[] args) {
        Dice dice = new Dice(1);
        Player p1 = new Player("Lakshya", 1);
        Player p2 = new Player("Nishant", 2);
        Player p3 = new Player("Vivek", 3);
        Queue<Player> allPlayers = new LinkedList<>();
        allPlayers.offer(p1);
        allPlayers.offer(p2);
        allPlayers.offer(p3);
        Jumper snake1 = new Jumper(99, 2);
        Jumper snake2 = new Jumper(17, 1);
        List<Jumper> snakes = new LinkedList<>();
        snakes.add(snake1);
        snakes.add(snake2);

        Jumper ladder1 = new Jumper(7, 15);
        Jumper ladder2 = new Jumper(23, 100);
        List<Jumper> ladders = new LinkedList<>();
        ladders.add(ladder1);
        ladders.add(ladder2);

        Map<String,Integer> playerCurrentPosition = new HashMap<>();
        playerCurrentPosition.put("Lakshya", 0);
        playerCurrentPosition.put("Nishant", 0);
        playerCurrentPosition.put("Vivek", 0);

        int boardSize = 100;


        GameBoard gameBoard = new GameBoard(dice, allPlayers, snakes, ladders, playerCurrentPosition, boardSize);
        gameBoard.startGame();


    }
}
