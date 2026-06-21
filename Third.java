import java.util.Scanner;
public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        //System.out.println("Hallloooooo " + name +" how you doin?! ");
        System.out.print("Enter your age: "); 
        int age = scanner.nextInt();
        scanner.nextLine();
        //This is important as without the line above the next line will not work because of the /n that will be scanned and not the string in the next line
        System.out.print("What is your favourite colour? ");
        String color = scanner.nextLine();
        System.out.print("What is your GPA? ");
        double gpa = scanner.nextDouble();
        System.out.print("Are you a student? (true/false) ");
        boolean isStudent = scanner.nextBoolean();
        System.out.println("Your name is " + name + " and you are " + age + " years old. Your GPA is " + gpa + " and your favourite color is " + color);
        System.out.println("Student: " + isStudent);
        if (isStudent){
            System.out.println("You are enrolled as a student.");
        }
        else {
            System.out.println("You are not enrolled as a student.");
        }
        scanner.close();
    }
}
