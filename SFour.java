public class SFour {
    public static void main(String[] args) {
        /* They help protect object data and add rules for accessing or modifying them.
        GETTERS = Methods that make a field READABLE.
        SETTERS = Methods that make a field WRITABLE.
        */
       Car3 car = new Car3("Charger", "Yellow", 10000);
       // car.model = "Corvette"; we can change the model like this
       // but if we use private in the Car3 model section, we can't  do it anymoar
       //System.out.println(car.color + " " + car.model + " " + car.price); 
       // // as they are all private we can't get them
       // here we use Getters and Setters

       car.setColor("Red");
       car.setPrice(0);

       System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice()); 
    }
}
