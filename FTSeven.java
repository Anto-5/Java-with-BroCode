public class FTSeven {
    public static void main(String[] args) {
        //SUPER = Refers to the parent class (subclass <- superclass)
        // Used in constructors and method overriding
        // Calls the parent constructor to initialize attributes

        Person person = new Person("Tom", "Riddle");
        Studentt student = new Studentt("Harry", "Potter", 4.0);
        person.showName();
        student.showName();
        System.out.println(student.gpa);
        student.showGPA();
    }
    
}
