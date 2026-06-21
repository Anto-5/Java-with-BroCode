public class Thirteenth {
    public static void main(String[] args) {
       /* String name = "Spongebob";
        char firstletter = 'S';
        int age = 30;
        double height1 = 60.555555;
        double height2 = 60.555555;
        double height3 = -60.555555;
        double height4 = 60000000.555555;
        boolean isEmployed = true;
        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with a %c\n", firstletter);
        System.out.printf("You are %d years of age.\n", age);
        // see precision of the height using .1 or .2 or .3 etc
        System.out.printf("Your hight is %.1f\n", height1);
        System.out.printf("Your hight is %+.1f\n", height2);
        // + sign to see if the number is positive or negative
        System.out.printf("Your hight is %+.1f\n", height3);
        //use the , sign to put commas in the number
        System.out.printf("Your hight is %,.1f\n", height4);
        // using ( any negative numbers are enclosed in parenthesis;
         System.out.printf("Your hight is %(.1f\n", height2);
        System.out.printf("Your hight is %(.1f\n", height3);
        // space character will display a minus if negative, space if positive
        System.out.printf("Your hight is % .1f\n", height2);
         System.out.printf("Your hight is % .1f\n", height3);
        System.out.printf("Your employment status is: %b \n", isEmployed);*/

    //NOW WE ARE GOING TO THE WIDTH 

    int id1= 1;
    int id2 = 23;
    int id3 = 455;
    int id4 = 5660;
    // using 0 afterthe % we can zero pad these values and we added the 4 as we have max 4 digit number
    System.out.printf("%04d\n", id1);
    System.out.printf("%04d\n", id2);
    System.out.printf("%04d\n", id3);
    System.out.printf("%04d\n", id4);
    // just the number to just make the space blank or right justified padding
    System.out.printf("%4d\n", id1);
    System.out.printf("%4d\n", id2);
    System.out.printf("%4d\n", id3);
    System.out.printf("%4d\n", id4);
    // use negative and then the number to to the right justified padding
    System.out.printf("%-4d\n", id1);
    System.out.printf("%-4d\n", id2);
    System.out.printf("%-4d\n", id3);
    System.out.printf("%-4d\n", id4);
    }
    
}
