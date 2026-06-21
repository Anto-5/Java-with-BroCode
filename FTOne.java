public class FTOne {
    public static void main(String[] args) {
        // FINALLLY OOPS WITH JAVA now 
        // Object = an entity that holds data (attributes) and can perform actions (methods)
        // It is a reference data type
        // kinda like how you use the scanner and random classes
        Car car = new Car();
        System.out.println(car.model);
        System.out.println(car.make);
        System.out.println(car.price);
        System.out.println(car.year);
        System.out.println(car.isRunning);
        /*car.isRunning = true;
        System.out.println(car.isRunning);*/ 
        car.start();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);
        car.drive();
        car.brake();
    }
    
}
