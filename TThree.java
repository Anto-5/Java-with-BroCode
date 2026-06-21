import java.util.Scanner;
public class TThree {
    public static void main(String[] args) {
        // A simple calculator using advanced switches
        Scanner scn = new Scanner(System.in);
        double num1, num2;
        double result = 0;
        char operator;
        boolean validOperator = true;
        System.out.println("Enter the first number:");
        num1 = scn.nextDouble();
        System.out.println("Enter the second number: ");
        num2 = scn.nextDouble();
        System.out.println("Which operation would you like to perform? (+, -, *, /, ^) ");
        operator = scn.next().charAt(0);
        switch (operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1*num2;
            case '/' -> {if(num2 == 0){
                System.out.println("Cannot divide by zero.");
                validOperator = false;
            }
            else{
                result = num1/num2;
            }}
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid operator.");
                validOperator = false;
            }
        }
        if(validOperator){
        System.out.printf("Your result is: %.2f ",result);
    
    }
        scn.close();
    }
    
}
