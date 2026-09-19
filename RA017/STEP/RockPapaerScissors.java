import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    // Method to determine the winner
    static String playRound(String playerMove, String computerMove) {

        if (playerMove.equals(computerMove)) {
            return "Draw";
        }

        if ((playerMove.equals("Rock") && computerMove.equals("Scissors")) ||
            (playerMove.equals("Paper") && computerMove.equals("Rock")) ||
            (playerMove.equals("Scissors") && computerMove.equals("Paper"))) {
            return "Player Wins";
        }

        return "Computer Wins";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int wins = 0;
        int losses = 0;
        int draws = 0;

        String[] moves = {"Rock", "Paper", "Scissors"};

        System.out.println("===== ROCK PAPER SCISSORS GAME =====");

        for (int round = 1; round <= 5; round++) {

            System.out.println("\nRound " + round);
            System.out.print("Enter your move (Rock/Paper/Scissors): ");

            String playerMove = sc.next();

            // Generate computer move randomly
            String computerMove = moves[random.nextInt(3)];

            // Determine result
            String result = playRound(playerMove, computerMove);

            System.out.println("Player Move   : " + playerMove);
            System.out.println("Computer Move : " + computerMove);
            System.out.println("Result        : " + result);

            // Update scores
            if (result.equals("Player Wins")) {
                wins++;
            } 
            else if (result.equals("Computer Wins")) {
                losses++;
            } 
            else {
                draws++;
            }
        }

        double winPercentage = (wins / 5.0) * 100;

        System.out.println("\n===== FINAL SUMMARY =====");
        System.out.println("Round | Player Move | Computer Move | Result");
        System.out.println("--------------------------------------------");

        System.out.println("Wins   : " + wins);
        System.out.println("Losses : " + losses);
        System.out.println("Draws  : " + draws);
        System.out.println("Win %  : " + winPercentage + "%");

        sc.close();
    }
}