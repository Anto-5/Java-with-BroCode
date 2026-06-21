import java.util.Scanner;
public class TTwo {
    public static void main(String[] args) {
        // Enhanced Switches = a switch statement that is more compact and easier to read than a standard switch statement.
        // It is like a replacement for a lot of else if statements
       Scanner scn = new Scanner(System.in);
       String day;
        System.out.print("Enter the day of the week: ");
        day = scn.nextLine();
        
        switch(day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It is a weekday. ");
            case "Saturday", "Sunday" -> System.out.println("It is the weekend. "); 
            default -> System.out.println("Invalid day.");
        }
        scn.close();
    }
    
}
