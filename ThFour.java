import java.util.Scanner;

public class ThFour {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows;
        int columns;
        char symbol;

        System.out.print("Enter the number of rows: ");
        rows = scn.nextInt();
        System.out.print("Enter the number of columns: ");
        columns = scn.nextInt();
        System.out.print("Enter the symbol: ");
        symbol = scn.next().charAt(0);
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= i; j++)
                {
                    System.out.print(symbol + " ");
                }
    System.out.println();
}
scn.close();
}
}
