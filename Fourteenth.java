import java.util.Scanner;
public class Fourteenth {
    public static void main(String[] args) {
        // Compound interest calc
        Scanner scn = new Scanner(System.in);
        double principal;
        double rate;
        int timesCompound;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = scn.nextDouble();
        System.out.print("Enter the rate of interest: ");
        rate = scn.nextDouble() / 100;
        System.out.print("Enter the number of times compounded: ");
        timesCompound = scn.nextInt();
        System.out.print("Enter the number of years: ");
        years = scn.nextInt();
        amount = principal * Math.pow((1 + rate / timesCompound), timesCompound * years);
        double CompoundInterest = amount - principal;
        System.out.printf("The interest amount is: %.1f\n", CompoundInterest);
        System.out.printf("The total amount is: %.1f \n", amount);
        scn.close();
    }
}
