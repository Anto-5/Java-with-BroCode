import java.util.*;
public class Tenth {
    public static void main(String[] args) {
    Random random = new Random();

    int number1;
    int number2;
    int number3;
    double number4;
    boolean isHeads;

    number1 = random.nextInt(1, 11);
    number2 = random.nextInt(11, 21);
    number3 = random.nextInt(21, 31);
    number4 = random.nextDouble(0, 101);
    isHeads = random.nextBoolean();
    System.out.println("The first random number is: " + number1);
    System.out.println("The second random number is: " + number2);
    System.out.println("The third random number is: " + number3);
    System.out.println("The fourth random number is: " + number4);
    if(isHeads){
        System.out.println("The coin is heads.");
    }
    else{
        System.out.println("The coin is tails.");
    }
    }
}
