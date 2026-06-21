import java.util.Scanner;
public class Fifteenth {
    //NESTED IF ELSE
    public static void main(String[] args) {
        boolean isStudent;
        boolean isSenior;
        double price;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the price: ");
        price = scn.nextDouble();
        System.out.print("Are you a student? (true/false) : ");
        isStudent = scn.nextBoolean();
        System.out.print("Are you a senior? (true/false) : ");
        isSenior = scn.nextBoolean();
        if(isStudent){
            if(isSenior){
                System.out.println("You are a senior. You get a 10% discount.");
                price = price * 0.90;
                System.out.printf("Your total is : $%.2f", price);
            }
            else{
            System.out.println("You are a student. You get a 5% discount.");
            price = price * 0.95;
            System.out.printf("Your total is : $%.2f", price);
            }
        }
        else{
            System.out.println("You are not a student. You get no discount.");
           System.out.printf("Your total is : $%.2f", price);
        }
        scn.close();
    }
}
