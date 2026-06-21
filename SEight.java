public class SEight {
    public static void main(String[] args) {
        // COMPOSITION = Represents a "part-of" relationship between objects
        /*For example, an egnine is "Part of " a car
        Allows complex objects to be constructed from smaller objects */
        Car4 car = new Car4("Corvette", 2025, "V8");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);

        car.start();

    }
    
}
