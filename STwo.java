public class STwo {
    public static void main(String[] args) {
        /*POLYMORPHISM =  Many + Shape 
        Objects can identify as other objects 
        Objects can be treated as objects of a common superclass 
        like a dog can be identified as a dog, an animal. an organism, even an object though it is not an object you heartless piece of shit */
        Carrr car = new Carrr();
        Bike bike = new Bike();
        Boat boat = new Boat();

        car.go();
        bike.go();
        boat.go();

        // Carrr[] cars = {car, bike, boat}; bike and boat can't be converted to car and same for all other cases
        // Bike[] bikes = {car, bike, boat};  These 3 will give error messages 
        // Boat[] boats = {car, bike, boat}; 
        Vehicle[] vehicles = {car, bike, boat};

        for (Vehicle vehicle : vehicles){
            vehicle.go();
        }
        // WE CAN ALSO USE Vechicle as an INTERFACE just add implements keyword and then public void in all carrr bike and boat 
    }
    
}
