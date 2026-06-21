import java.util.*;

public class Fifty {
    public static void main(String[] args) {
        // ROCK PAPER AND SCISSORS also look at SLOT MACHINE
        Scanner scn = new Scanner(System.in);
        Random rand = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do {
            System.out.print("Enter your move (rock/paper/scissors): ");
            playerChoice = scn.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") && 
                !playerChoice.equals("paper") && 
                !playerChoice.equals("scissors")) {
                
                System.out.println("Invalid move. Please try again.\n");
                continue;
            }

            System.out.println("You chose: " + playerChoice);

            computerChoice = choices[rand.nextInt(3)];
            System.out.println("Computer chose: " + computerChoice);

            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a draw!");
            } 
            else if (
                (playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                (playerChoice.equals("scissors") && computerChoice.equals("paper"))
            ) {
                System.out.println("You win!");
            } 
            else {
                System.out.println("You lose!");
            }

            
            while (true) {
                System.out.print("Play again? (yes/no): ");
                playAgain = scn.nextLine().toLowerCase();

                if (playAgain.equals("yes") || playAgain.equals("no")) {
                    break; // valid input → exit loop
                } else {
                    System.out.println("Invalid input. Please type only 'yes' or 'no'.");
                }
            }

            System.out.println();

        } while (playAgain.equals("yes"));

        System.out.println("Thanks for playing!");
        scn.close();
    }
}