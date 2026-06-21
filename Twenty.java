import java.util.Scanner;
public class Twenty {
    public static void main(String[] args) {
        // temperature conversion program
        Scanner scn = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        System.out.println("Temperature conversion program :");
        System.out.println("Choose 1 to : Convert fahrenheit to celsius");
        System.out.println("Choose 2 to : Convert celsius to fahrenheit");
        System.out.print("Enter your choice : ");
        int choice = scn.nextInt();
        if (choice == 1) {
            System.out.print("Enter the temperature in fahrenheit : ");
            fahrenheit = scn.nextDouble();
            celsius = (fahrenheit - 32) * 5 / 9;
            System.out.printf("The temperature in celsius is : %.2f", celsius);
        } else if (choice == 2) {
            System.out.print("Enter the temperature in celsius : ");
            celsius = scn.nextDouble();
            fahrenheit = (celsius * 9 / 5) + 32;
            System.out.printf("The temperature in fahrenheit is : %.2f", fahrenheit);
        } else {
            System.out.println("Invalid choice");
        }
        scn.close();
    }
    
}
