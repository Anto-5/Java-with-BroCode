public class FTTwo {
    public static void main(String[] args) {
        //constructor =  A special method to initialize objects 
    // you can pass arguments to a constructor and set up initial values

    Student stu1 = new Student("Anto", 21, 4.0, true);
    Student stu2 = new Student("Pappu", 22, 3.5, false);

    System.out.println(stu1.name);
    System.out.println(stu1.age);
    System.out.println(stu1.gpa);

    System.out.println(stu2.name);
    System.out.println(stu2.age);
    System.out.println(stu2.gpa);
    }
    

    
}
