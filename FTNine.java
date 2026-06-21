public class FTNine {
    public static void main(String[] args) {
        /* .toString() = Method inherited from the Object class.
        Used to return a string representation of an object.
        By default, it returns a hash code as a unique identifier.
        It can be overridden to provide meaningful details.
        */
       Carr car = new Carr("Ford", "Mustang",2025, "Red");
       Carr car1 = new Carr("Chervolet", "Corvette", 2026, "Black");
       System.out.println(car);
       System.out.println(car1);

    }
    
}
