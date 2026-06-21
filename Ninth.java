import java.util.Scanner;
public class Ninth {
    public static void main(String[] args) {
        boolean isStudent;
        Scanner scn = new Scanner(System.in);
        int age;
        System.out.print("Enter the age: ");
        age = scn.nextInt();
        scn.nextLine();
        String name;
        System.out.print("Enter your name: ");
        name = scn.nextLine();

        //Group 1
        if (name.isEmpty()) {
            System.out.println("The name is empty.");
        }
        else{
            System.out.println("Halllloooo " + name + "!");
        }


        //Group 2
        if (age >= 0 && age != 25) {
            System.out.println("The person is not 25 years of age.");
            if(age<25){
                System.out.println("The person is less than 25 years of age.");
            }
            else{
                System.out.println("The person is more than 25 years of age.");
            }
        }
        else if(age == 25){
            System.out.println("The person is 25 years old.");
        }
        else {
            System.out.println("Entered age is invalid. ");
        }
        System.out.println("They are " + age + " years old.");

        //group 3

        System.out.print("Are you a student? (true/false) ");
        isStudent = scn.nextBoolean();
        if(isStudent){
            System.out.println("You are a student.");
        }
        else{
            System.out.println("You are not a student.");
        }
        scn.close();
    }
    
}
