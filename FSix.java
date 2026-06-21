import java.util.*;

public class FSix {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("How many numbers do you wish to add?");
        int x = scn.nextInt();

        int[] numbers = new int[x];

        for(int i = 0; i < x; i++){
            System.out.print("Enter number " + (i+1) + ": ");
            numbers[i] = scn.nextInt();
        }

        System.out.println("The sum of the numbers is: " + add(numbers));
        System.out.println("The average of the numbers is: " + avg(numbers));

        scn.close();
    }

    // Sum method
    static int add(int... numbers){
        int sum = 0;

        for(int number : numbers){
            sum += number;
        }

        return sum;
    }

    // Average method
    static double avg(int... numbers){

        if(numbers.length == 0){
            return 0; // avoid division by zero
        }

        int sum = 0;

        for(int number : numbers){
            sum += number;
        }

        return (double) sum / numbers.length;
    }
}