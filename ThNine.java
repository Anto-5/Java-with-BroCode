import java.util.Scanner;

public class ThNine {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter how many numbers you want to add: ");
        int n = scn.nextInt();

        double[] arr = new double[n];

        for(int i = 0; i < n; i++){
            System.out.print("Enter number " + (i+1) + ": ");
            arr[i] = scn.nextDouble();
        }

        System.out.println("Sum = " + add(arr));

        scn.close();
    }

    static double add(double... numbers){
        double sum = 0;

        for(double num : numbers){
            sum += num;
        }

        return sum;
    }
}