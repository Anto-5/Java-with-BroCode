public class FTSix {
    public static void main(String[] args) {
        // INHERITANCE = One class inherits the attributes and methods from another class
        // Child <- Parent <- Grandparent
        // ORGANISM = Grandparent class, Animal & Plant = parent classes, Dog and Cat = child classes if Animal class
        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);
        System.out.println(plant.isAlive);
        plant.photosynthesize();

        dog.eat();
        cat.eat();

        System.out.println(dog.lives);
        System.out.println(cat.lives);
        dog.speak();
        cat.speak();


    }
    
}
