import java.util.*;
public class FFive {
    public static void main(String[] args) {
        // Searching thorugh the array for elements
        Scanner scn = new Scanner(System.in);
        int [] numbers = {1, 9, 2, 8, 3, 5, 4};
        String[] fruits = {"apples", "orange", "banana", "kiwi"};

        System.out.println("Enter the element you wish to search for: ");
        int x = scn.nextInt();
        scn.nextLine();
        boolean isFound = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println("Found the number " + x + " at index " + i);
                isFound = true;
                break;
                
            }
        }
        // (could also use !isFound instead of if(isFound == false) it just means the same thing)
        if(isFound == false){
            System.out.println("The number " + x + " was not found in the array.");
        }

        //FOR A STRING ARRAY
        System.out.println("Enter the name of the fruit you wish to search for: ");
        String y = scn.nextLine();
        isFound = false;
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(y)) {
                System.out.println("Found the fruit " + y + " at index " + i);
                isFound = true;
                break;
            }
        }
        // (could also use !isFound instead of if(isFound == false) it just means the same thing)
        if(isFound == false){
            System.out.println("The fruit " + y + " was not found in the array.");
        }
        
        
        
        
        scn.close();
    }
    
}
