import java.util.Scanner;
import java.util.Random;
public class FTwo {
    public static void main(String[] args) {
        // JAVA DICE ROLLER PROGRAM

        Scanner scn = new Scanner(System.in);
        Random random = new Random();
        int numODice = 0;
        int total = 0;
        System.out.print("Enter the number of dice to roll: ");
        numODice = scn.nextInt();
        if(numODice > 0){
            System.out.println("You roll the dice! ");
            for(int i = 0; i < numODice; i++){
                int roll = random.nextInt(1, 7);
                System.out.println("You rolled a: " + roll);
                printDie(roll);
                total = total + roll;
            }
            System.out.println("Your total is: " + total);

        }
        else if(numODice == 0){
            System.out.println("You can't roll a dice if you don't have one :( ");
        }
        else{
            System.out.println("Invalid number of dice. Please try again.");
        }
        scn.close();
    }
    static void printDie(int roll){

        String dice1 = """
                +-------+
                |       |
                |   *   |
                |       |
                +-------+
                """;

        String dice2 = """
                +-------+
                | *     |
                |       |
                |     * |
                +-------+
                """;    

        String dice3 = """
                +-------+
                | *     |
                |   *   |
                |     * |
                +-------+
                """;    

        String dice4 = """
                +-------+
                | *   * |
                |       |
                | *   * |
                +-------+
                """;       
        String dice5 = """
                +-------+
                | *   * |
                |   *   |
                | *   * |
                +-------+
                """;
        String dice6 = """
                +-------+
                | *   * |
                | *   * |
                | *   * |
                +-------+ 
                """;
            switch(roll){
                case 1 : System.out.println(dice1);
                break;
                case 2 : System.out.println(dice2);
                break;
                case 3 : System.out.println(dice3);
                break;
                case 4 : System.out.println(dice4);
                break;
                case 5 : System.out.println(dice5);
                break;
                case 6 : System.out.println(dice6);
                break;
                default : System.out.println("Invalid roll.");
                break;
            }
    }
    
}
