import java.util.Scanner;
public class SThree {
    public static void main(String[] args) {
        /*RUNTIME POLYMORPHISM OR DYNAMIC POLYMORPHISM =  Same method name but different implementations 
        When the method that gets executed is decided at runtime based on  the actual type of the object*/
        Scanner scn = new Scanner(System.in);
        Animalll animal; 
        System.out.println("Would you like to choose a dog or a cat?(1 for dog, 2 for cat): ");
        int choice = scn.nextInt();
        if(choice == 1){
            animal = new Dawg();
            animal.speak();
        }
        else if(choice == 2){
            animal = new Cattt();
            animal.speak();
        }
        else{
            System.out.println("Invalid choice");
        }
        // SO we did use a speak method but we did not know which one till the user chose one.
        // THIS is known as runtime polymorphism
        scn.close();
    }
    
}
