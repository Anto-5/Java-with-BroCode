public class SOne {
    public static void main(String[] args) {
        /*INTERFACE = A blueprint for a class that specifies a set of abstract methods
        that implementing classes MUST define
        Supports multiple inheritance-like behavoir */
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        FIshh fish = new FIshh();
        rabbit.flee();
        hawk.hunt();    
        fish.hunt();
        fish.flee();
    }
    
}
