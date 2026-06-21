import java.util.Scanner;

public class TOne {
    public static void main(String[] args) {
        // Same but a different approach
        Scanner scn = new Scanner(System.in);
        double temp;
         double newTemp;
         String unit;
         System.out.println("Enter the temperature: ");
         temp = scn.nextInt();
         scn.nextLine();
         System.out.println("Convert to Celcius or Fahrenheit? (C or F): ");
         unit = scn.nextLine().toUpperCase();
         
         newTemp = (unit.equals("C")) ? (newTemp = (temp - 32) * 5 / 9) : (newTemp = (temp * 9 / 5) + 32);
         System.out.printf("The temperature in %s is: %.2f %s", unit, newTemp, unit);

         scn.close();
        }
    
}
