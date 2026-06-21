import java.util.Scanner;
public class TFour {
    public static void main(String[] args) {
        // say we want someone to make a username 
        //username must not contain spaces or underscore
        // username must be between 4-12 characters long
        Scanner scn = new Scanner(System.in);
        String username;
        System.out.println("Enter the username you want to make:");
        username = scn.nextLine();
        if(username.length() < 4 || username.length() > 12){
            System.out.println("Invalid username. Username must be between 4 and 12 characters long.");
        }
        else if(username.contains(" ") || username.contains("_")){
            System.out.println("Username cannot contain spaces or underscores.");
        }
        else{
            System.out.println("The username your entered is: " + username + ". Username is valid.");
        }
        scn.close();
    }
    
}
