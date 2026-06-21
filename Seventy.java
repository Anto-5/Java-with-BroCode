public class Seventy {
    public static void main(String[] args) {
        String a = Integer.toString(123);
        String b = Double.toString(2.14);
        String c = Character.toString('@');
        String d = Boolean.toString(false);

        String x = a + b + c + d;
        System.out.println(x); 

        char letter = 'b';
        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));
        
    }
    
}
