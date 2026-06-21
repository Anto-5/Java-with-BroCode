import java.util.Scanner;
public class Fourth {
public static void main(String[] args){
        //Finding the area of a rectangle
        double length = 0;
        double breath = 0;
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter the length of the rectangle: ");
        length = scanner.nextInt();
        System.out.print("Enter the breath of the rectangle: ");
        breath = scanner.nextInt();
        double Area = length * breath;
        System.out.println("The area of the rectanle is: " + Area + " cm² or " + Area + " m²" );
        scanner.close();
    }
    
}
