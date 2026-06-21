import java.util.Scanner;
public class Eleventh {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        /*double result;
        System.out.println("Enter the number: ");
        double a = scn.nextDouble();
        System.out.println("Enter the power: ");
        int b = scn.nextInt();
        result = Math.pow(a, b);
        System.out.println(result);*/
        //WE HAVE A LOT OF MATH FUNCTIONS AVAILABLE
        //Just use Math.(any of the following): pow, abs, sqrt, round, ceiling, floor, max, min
        //Below is the code to find the hypotenuse of a triangle

        double base;
        double height;
        System.out.println("Enter the base: ");
        base = scn.nextDouble();
        System.out.println("Enter the height: ");
        height = scn.nextDouble();
        double hypotenuse = Math.sqrt(base*base + height*height);
        //can also do Math.pow(base, 2) + height(base, 2) inside the bracket
        System.out.println("The Hypotenuse of the triangle is: " + hypotenuse);
        scn.close();
    }
    
}
