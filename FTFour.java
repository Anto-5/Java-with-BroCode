public class FTFour {
    public static void main(String[] args) {
        // ARRAY OF OBJECTS in JAVA = an array that can hold objects of different types
        Car2 car1 = new Car2("Honda", "Red");
        Car2 carTwo = new Car2("Toyota", "Blue");
        Car2 car3 = new Car2("Corvette", "Blue");

        //Car2[] cars = new Car2[enter the number of elements]; OR
        /*Car2[] cars = {new Car2("Honda", "Red"), 
                         new Car2("Toyota", "Blue"),  THESE ARE CALLED ANONYMOUS OBJECTS
                         new Car2("Corvette", "Blue"); */
        Car2[] cars = {car1, carTwo, car3};
        /*for(int i = 0; i<cars.length; i++){
            cars[i].drive(); IT IS BETTER TO USE AN ENHANCED FOR LOOP
        }*/
        for(Car2 car: cars){    
            car.drive();
    }
    for(Car2 car: cars){
        car.color = "Black";
        car.drive();
    }
    
}
}
