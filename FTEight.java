public class FTEight {
    public static void main(String[] args) {
        // METHOD OVERRIDING = WHen a subclass provies its own implementation 
        // of a method that is already defined.
        // Allows for code reusablility and give specific implementation.
        Dogg dog = new Dogg();
        Catt cat = new Catt();
        Fish fish = new Fish();

        dog.move();
        cat.move();
        fish.move();
    }
    
}
