public class Sixteenth {
    public static void main(String[] args) {
        //String methods
        String name = "Pappu pelu";
        int length = name.length();
        System.out.println("The length of the string is: " + length);
        char letter = name.charAt(3);
        System.out.println(letter);
        int index = name.indexOf("e");
        System.out.println(index);
        int lastIndex = name.lastIndexOf("p");
        System.out.println(lastIndex);
        name = name.toLowerCase();
        System.out.println(name);
        name = name.toUpperCase();
        System.out.println(name);
        String name2 = "         Pappu    pelu        ";
        name2 = name2.trim();
        System.out.println(name2);
        name = name.replace("P","a" );
        System.out.println(name);
        System.out.println(name.isEmpty());

        if(name.contains (" ")){
            System.out.println("The string contains a space.");
        }
        else{
            System.out.println("The string does not contain any spaces. ");
        }
        if(name.equals("password")){
            System.out.println("Your name is password. Change it to something else.");
        }
        else{
            System.out.println("Your name is not password. Keep it that way.");
        }

    }
    
}
