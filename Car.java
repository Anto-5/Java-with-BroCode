public class Car {
    String make = "Hyundai";
    String model = "I10";
    int year = 2020;
    double price = 100000.967889;
    boolean isRunning = false;
    
    void start(){
        isRunning = true;
        System.out.println("You start the engine");
    }
    void stop (){
        isRunning = false;
        System.out.println("You stop the engine");
    }
    void drive () {
        System.out.println("You drive the: " + model);
    }
    void brake () {
        System.out.println("You brake the: " + model);
    }
}
