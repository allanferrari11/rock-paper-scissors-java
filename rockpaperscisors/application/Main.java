package rockpaperscisors.application;

import rockpaperscisors.domain.Move;
import rockpaperscisors.domain.Player;

public class Main {
    public static void main(String[] args) {

        Player player1 = new Player("Allan");
        Player player2 = new Player("Jéssica");

        player1.setCurrentMove(Move.PAPER);
        player2.setCurrentMove(Move.SCISSORS);

        System.out.println(player1.getName() + " choose " + player1.getCurrentMove().getDescription());
        System.out.println(player2.getName() + " choose " + player2.getCurrentMove().getDescription());

        if (player1.getCurrentMove() == player2.getCurrentMove()) {
            System.out.println("Result: Tie!");

        } else if (player1.getCurrentMove().beats(player2.getCurrentMove())) {
            System.out.println("Result: " + player1.getName() + " wins!");

        } else {
            System.out.println("Result: " + player2.getName() + " wins!");

        }

    }

}
