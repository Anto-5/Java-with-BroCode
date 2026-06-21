import java.util.*;
public class FFour {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of foods: ");
        int n = scn.nextInt();
        scn.nextLine();
        String[] foods = new String[n];
        /*System.out.println("Enter the first food:");
        foods[0] = scn.nextLine();
        System.out.println("Enter the second food:");
        foods[1] = scn.nextLine();
        System.out.println("Enter the third food:");
        foods[2] = scn.nextLine();*/
        // OR
        for (int i = 0; i < n; i++) {
            System.out.println("Enter food number " + (i + 1) + " :");
            foods[i] = scn.nextLine();
        }
        for (String food: foods){
            System.out.println(food);
        }
        System.out.println(foods.length);
        scn.close();

}
}
