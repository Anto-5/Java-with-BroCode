import java.util.Scanner;
public class Eighth {
    public static void main(String[]args){
     //SHOPPING CART PROGRAM
     Scanner scn = new Scanner(System.in);
     String item;
     double price;
     int quantity;
     char currency = '$';
     double total;
     System.out.print("What item would you like to buy? ");
     item = scn.nextLine();
     
     System.out.print("What is the price of each? ");
     price = scn.nextDouble();
     
     System.out.print("How many would you like? ");
     quantity = scn.nextInt();
     
     total = price * quantity;
     
     System.out.println(item);
     System.out.println("" + currency + price);
     System.out.println(quantity);
     System.out.println("Your total amount is " + currency + total);

     scn.close();
    }
    
}
