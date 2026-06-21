import java.util.Random;
import java.util.Scanner;
public class TEight {
    public static void main(String[] args) {
        //Number Guessing game
        Random random = new Random();
        Scanner scn = new Scanner(System.in);
        int guess;
        int attempts = 0;
        int randomNumber = random.nextInt(1, 11);
        System.out.println("Number guessing game! ");
        System.out.println("Guess a number between 1-10: ");
        do{
            guess = scn.nextInt();
            System.out.println("The random number was: " + randomNumber);
            System.out.println("You guessed: " + guess);
            attempts++;
            if(guess!=randomNumber) System.out.println("Wrong guess! Try again.");
            randomNumber = random.nextInt(1, 11);
        }while ( guess!=randomNumber);

        System.out.println("You guessed correct! You have won nothing :( ");
        System.out.println("You took " + attempts + " attempts.");
        scn.close();
    }
    
}
