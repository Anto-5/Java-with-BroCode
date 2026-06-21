import java.util.*;

public class Twelth {
    public static void main(String[] args) {
        double radius;
        final double PI = 3.14;

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = scn.nextDouble();

        double circumference = 2 * PI * radius;
        double area = PI * Math.pow(radius, 2);

        //see how the 4 and 3 are not integers
        double volume = (4.0 / 3.0) * PI * Math.pow(radius, 3); // sphere
        //see how to use print f; no + but a , sign
        System.out.printf("Circumference: %.1f cm\n", circumference);
        System.out.printf("Area: %.1f cm²\n", area);
        System.out.printf("Volume (sphere): %.1f cm³\n", volume);

        scn.close();
    }
}