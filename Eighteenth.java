import java.util.Scanner;
public class Eighteenth {
    public static void main(String[] args) {
        // weight conversion program

        Scanner scn = new Scanner(System.in);
        double weight;
        double newWeight;
        int choice;
        System.out.println("Weight conversion program :");
        System.out.println("Choose 1 to : Convert lbs to kgs");
        System.out.println("Choose 2 to : Convert kgs to lbs");
        System.out.print("Enter your choice : ");
        choice = scn.nextInt();
        if(choice == 1){
            System.out.print("Enter the weight in lbs : ");
            weight = scn.nextDouble();
            newWeight = weight * 0.45359237;
            System.out.printf("The weight in kgs is : %.2f", newWeight);
        }
           
        else if(choice == 2){
            System.out.print("Enter the weight in kgs : ");
            weight = scn.nextDouble();
            newWeight = weight / 0.45359237;
             System.out.printf("The weight in lbs is : %.2f", newWeight);
           
        }
        else{
            System.out.println("Invalid choice");
        }
        scn.close();
    }
    
}
