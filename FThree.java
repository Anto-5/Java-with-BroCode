import java.util.*;
public class FThree {
    public static void main(String[] args) {
        // ARRAYYYYYYY = a collection of values of the same type 
        // basically like a variable that can store moar than one value 
        String[] fruits = {"apples", "oranges", "bananas", "kiwis"};
        fruits [3] = "grapes";
        /*System.out.println(fruits[0]);
        System.out.println(fruits[1]);
        System.out.println(fruits[2]);
        System.out.println(fruits[3]);*/
        int numOfFruits = fruits.length;
        System.out.println(numOfFruits);
        for (int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }
        System.out.println("\n");

        // ENHANCED FOR LOOP    
        for (String fruit : fruits){
            System.out.println(fruit);
        }
        System.out.println("\n");

        Arrays.sort(fruits);
        for (String fruit : fruits){
            System.out.println(fruit);
        }
        // use Arrays.fill(fruits, "pineapple") to replace each & every fruit with pineapple 

    }
    
}
