import java.util.Scanner;

public class FOne {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        double balance = 0; // initialize
        double withdrawAmount;
        double depositAmount;
        boolean isRunning = true;
        int choice;

        while(isRunning){

            System.out.println("****************");
            System.out.println("BANKING PROGRAM!");
            System.out.println("****************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("****************");

            System.out.print("Enter your choice (1-4): ");
            choice = scn.nextInt();

            switch(choice){
                case 1:
                    showBalance(balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    depositAmount = scn.nextDouble();
                    balance = deposit(balance, depositAmount); //  update
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    withdrawAmount = scn.nextDouble();
                    balance = withdraw(balance, withdrawAmount); // update
                    break;

                case 4:
                    exitMessage();
                    isRunning = false;
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        scn.close();
    }

    // showBalance
    static void showBalance(double balance){
        System.out.printf("Balance: $%.2f\n", balance);
    }

    // deposit
    static double deposit(double balance, double amount){
        System.out.println("Deposited amount: $" + amount);
        balance = balance + amount;
        System.out.println("Updated balance: $" + balance);
        return balance;
    }

    // withdraw
    static double withdraw(double balance, double amount){

    if (amount <= 0) {
        System.out.println(" Withdrawal amount must be positive!");
        return balance;
    }

    if (amount > balance){
        System.out.println(" Insufficient funds!");
        return balance;
    }

    balance -= amount;

    System.out.printf(" Withdrawn: $%.2f\n", amount);
    System.out.printf("Remaining balance: $%.2f\n", balance);

    return balance;
}

    // exit
    static void exitMessage(){
        System.out.println("Goodbye! Thank you for using our banking program.");
    }
}