import java.util.Scanner;
public class ThThree {
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
        for(int j = 0; j < rows; j++){
            for(int i = 0; i < columns; i++){
            System.out.print(symbol+ " ");
        } 
        System.out.println();
        }
        

        scn.close();
    }
    
}
