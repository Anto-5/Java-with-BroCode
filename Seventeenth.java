import java.util.Scanner;
public class Seventeenth {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String email;
        String username;
        String domain;
        //SUBSTRINGS = a method used to extract a portion of a string
        // .substring(start, end);
        System.out.print("Enter your email: ");
        email = scn.nextLine();

        if(email.contains("@")){
            System.out.println("The email is valid.");
            System.out.println("The email you entered is : " + email);
        /*String username = email.substring(0,6); //see how we have @ at 6th position so we need to end at 6 to get the 3 from 123
        System.out.println(username);*/
        // it would be better to use the method below
        username = email.substring(0, email.indexOf("@"));
        System.out.println("Your  default username is : " + username);
        domain = email.substring(email.indexOf("@") + 1);
        System.out.println("Your domain is : " + domain);

        }
        else{
            System.out.println("The entered email is not valid. They must have the @ character. ");
        }
        
        scn.close();

    }
    
}
