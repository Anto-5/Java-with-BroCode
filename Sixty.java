public class Sixty {
    public static void main(String[] args) {
        /* ABSTRACT = Used to define abstract classes and methods.
        Abstraction is the process of hiding implementation details
        and showing only the essential features;
        Abstract classes CAN'T be instantiated directly,
        Can contain 'abstract' methods (which must be imnplemented)
        Can contain 'concrete' methods (which are inherited)
        */
       // Shape shape = new Shape(); This will give an error as Shape can't be instantiated
       Circle circle = new Circle(3);
       Triangle triangle = new Triangle(4, 5);
       Rectangle rectangle = new Rectangle(5, 5);
       circle.display();       
       System.out.println(circle.area());       
       triangle.display();       
      System.out.println( triangle.area());       
       rectangle.display();       
       System.out.println(rectangle.area());       


    }
    
}
