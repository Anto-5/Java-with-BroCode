import java.util.Scanner;
public class Thirty {
    public static void main(String[] args) throws InterruptedException { 
        //this is just like a timer
        Scanner scn = new Scanner(System.in);
        System.out.print("How many seconds to countdowm from? ");
        int start = scn.nextInt(); 
        for (int i = start; i >0; i--){
            System.out.println(i);
            Thread.sleep(100);
        }
        System.out.println("Merry Christmas you filthy animal! & A happy new year! AHAHAHAHAHAHAH ");
        scn.close();
    }
    
}
