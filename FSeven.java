import java.util.*;
public class FSeven {
    public static void main(String[] args) {
        // 2D arrays in java
        String [] fruits = {"apple", "banana", "orange", "kiwi"};
        String [] vegetables = {"carrot", "broccoli", "spinach", "cauliflower"};
        String [] meats = {"chicken", "beef", "pork", "turkey"  };

        String [] [] groceries = {fruits, vegetables, meats};

        groceries[0][0] = "pineapple";
        groceries[1][1] = "aubergine";
        groceries[2][3] = "ham";
        for (String[] foods: groceries){
            for (String food: foods){
                System.out.print(food + " ");
            }
            System.out.println("\n");
        }
    }
    
}
