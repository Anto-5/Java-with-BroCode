import java.util.Scanner;
public class TSix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String response = "";
        while(!response.equals("Q")){
            System.out.println("You are stuck in a loop. ");
            System.out.println("Enter Q to quit: ");
            response = scn.nextLine().toUpperCase();
        }
        System.out.println("You have quit the game. You are a quitter. ");
        scn.close();
    }
    
}
