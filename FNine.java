import java.util.*;
public class FNine {
    public static void main(String[] args) {
        // JAVA QUIZ GAME
        String [] questions = {"What is the main function of a router?",
                                "Which part of the computer is considered the brain? ",
                                "What year was Facebook launched? ",
                                "Who is known as the father of computer?",
                                "What was the first programming language?"};

    String [][] options = {{"1. Storing files", "2. Encrypting data", "3. Directing internet traffic", "4. Managing passwords"},
                           {"1. CPU ", "2. Hard drive ", "3. RAM", "4. GPU"},
                           {"1. 2000 ", "2. 2004 ", "3. 2006 ", "4. 2008"},
                           {"1. Steve Jobs ", "2. Bill Gates", "3. Alan Turney", "4. Charles Babbage"},
                           {"1. COBOL ", "2. Fortran ", "3. C ", "4. Assembly "}}; 

    int [] answers = {3, 1, 2, 4, 2}; 
    int score = 0;
    int choice;
    Scanner scn = new Scanner(System.in);
    System.out.println("********************");
    System.out.println("Welcome to the JAVA QUIZ GAME!");
    System.out.println("********************");
    for(int i = 0; i < questions.length; i++){
        System.out.println(questions[i]);
        for(String option : options[i]){
            System.out.println(option);
        }
        System.out.println("Enter your choice: ");
        choice = scn.nextInt();
        if(choice == answers[i]){
            System.out.println("Correct Answer!");
            score++ ;
        }
        else{
            System.out.println("Wrong Answer!");
        }
        System.out.println("Your score is: " + score);
        System.out.println("********************");
        
    }
    System.out.println("Your final score is: " + score + " out of " + questions.length);

    scn.close();

    }
}
    
