import java.util.Scanner;
public class ThSeven {
    public static void main(String[] args) {
        // METHOD = a block of reusable code that is executed when called   ()
        String name = "Anto";
        int age = 21;

        
        double result = square (3);
        System.out.println(result);
        double result1 = cube (3);
        System.out.println(result1);
        happyBirthday(name, age);

        System.out.println(result);
        System.out.println(result1);
        happyBirthday(name, age);

        System.out.println(result);
        System.out.println(result1);
        happyBirthday(name, age);
    }

    // SEE how even when the string is called birthday boii in the method it still gets the value of the name in the main method 
    static void happyBirthday(String BirthdayBOIII, int age){
        System.out.println("Happy Birthday to you!");   
        System.out.printf("Happy birthday dear %s  \n", BirthdayBOIII);
        System.out.printf("You are %d years old! \n", age);
        System.out.println();

    }
    static double square(double number){
        return number*number;
    }
    static double cube (double number){
        return  number*number*number;
    }
    
}
