public class Friend {
    static int numOfFriends; // basically static will make a variable belong to the Friend class
    String name;

    Friend(String name){
        this.name = name;
        numOfFriends ++;
    }
    static void showFriends(){
        System.out.println("You have " + numOfFriends + " friends.");
    }
}
