import java.util.Scanner;
public class ThEight {
    public static void main(String[] args) {
        // OVERLOADED METHODS = methods with same name but with different parameters
        // SIGNATURE = name + parameters + return type

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the first number :");
        double a = scn.nextDouble();
        System.out.println("Enter the second number :");
        double b = scn.nextDouble();
        System.out.println(add ( a, b));
         System.out.println("Enter the third number: ");
        double c = scn.nextDouble();
        System.out.println(add ( a, b, c ));

    }    

    static double add (double a, double b){
        return a + b;
    }
    static double add (double a, double b, double c){
        return a + b + c;
    }
}
