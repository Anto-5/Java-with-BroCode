import java.util.Scanner;

public class TFive {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String name = "";

        while (name.isEmpty()) {
            System.out.print("Enter your name: ");
            name = scn.nextLine();

            if (name.isEmpty()) {
                System.out.println("Name can't be empty. Please try again.");
            }
        }

        System.out.println("Halloooo " + name + "! Welcome to hell!");

        scn.close();
    }
}