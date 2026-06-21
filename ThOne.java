public class ThOne {
    public static void main(String[] args) {
        // BREAK & CONTINUE statements
        // BREAK to exit out of a loop
        //CONTINUE to skip the current iteration of the loop
        System.out.println("This is the Break statement: " );
        for(int i = 0; i < 10; i++){
            if (i == 5) break;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("This is the continue statement: ");
        for(int i = 0; i < 10; i++){
            if (i == 5) continue;
            System.out.print(i+ " ");

        }

    }
    
}
