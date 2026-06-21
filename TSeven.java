import java.util.Scanner;
public class TSeven {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int age = 0;
        System.out.println("Enter your age: ");
        age = scn.nextInt();
        while(age < 0){
            System.out.println("Your age can't be negative.");
            System.out.println("Enter your age again : ");
            age = scn.nextInt();
        }

        if (age == 0){
            System.out.println("Then enter your age in months: ");
            int ageMonths = scn.nextInt();
            while(ageMonths < 0 || ageMonths> 12){
                System.out.println("Invalid age. Enter your age in months again: ");
                ageMonths = scn.nextInt();
            }
            System.out.println("You are " + ageMonths + " months old.");
        }
        else {
            System.out.println("You are " + age + " years old.");
        }
        
        scn.close();
    }
    
}
