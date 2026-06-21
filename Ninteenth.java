import java.util.Scanner;
public class Ninteenth {
    public static void main(String[] args) {
        //Ternary Operator = a conditional operator that can be used to assign a value to a variable based on a condition
        //variable = (condition) ? value if true : value if false;
        // to find if the year is a leap year or not using ternary operator
        Scanner scn = new Scanner(System.in);
        int year;
        System.out.print("Enter the year: ");
        year = scn.nextInt();
        boolean isLeapYear = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? true : false;
        if(isLeapYear){
            System.out.println(year + " is a leap year.");
        }
        else{
            System.out.println(year + " is not a leap year.");
        }
        scn.close();
    }
}
