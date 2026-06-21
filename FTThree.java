public class FTThree {
    public static void main(String[] args) {
        // OVERLOADING CONSTRCUTORS = allows a class to have multiple parameters list 
        // Enable objects to be initialized in various ways
        User user1 = new User("Anto");
        User user2 = new User("Anbi", "anbi2006@gmail.com");
        User user3 = new User("Anti", "dsfs@4w5gmail.com", 22);
        User user4 = new User();

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);
        System.out.println();
        
        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);
     System.out.println();
        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);
        System.out.println();

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);




    }
    
}
