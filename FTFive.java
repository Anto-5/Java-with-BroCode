public class FTFive {
    public static void main(String[] args) {
        // LEARNING ABOUT THE STATIC KEYWORD IN JAVA
        /*Static = makes a variable or method belong to a the class, rather than to any specific object
        Commonly used for utility methods or sharing resources */
        Friend friend1 = new Friend("Anto");
        Friend friend2 = new Friend("Anbi");

        System.out.println(Friend.numOfFriends);
        Friend.showFriends();

    }
    
}
