public class Forty {
    static int x = 0; // GLOBAL
    public static void main(String[] args) {
        // VARIABLE SCOPE = where variables can be accessed 
        // LOCAL VARIABLE = a variable declared inside a method or block of code
        // GLOBAL VARIABLE = a variable declared outside of a method or block of code

        System.out.println(x);//global x


        int x = 1; // LOCAL
        System.out.println(x);//local x
         doSomething();// local x present in the method


    }
    static void doSomething(){
        int x = 2; // LOCAL
        System.out.println(x);

    }
}
