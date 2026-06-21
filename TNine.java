import java.util.Scanner;
public class TNine {
    public static void main(String[] args) {
        //FOR LOOP = execute some code for a certain amount of times
        for(int i = 0; i < 10; i+=2){
            System.out.println("Pizza");
        }
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter how many times you want to loop: ");
        int max = scn.nextInt();
        for(int j = 0; j < max; j++)
            {
        System.out.println(j);
        }
        scn.close();
    }
    
    
}
