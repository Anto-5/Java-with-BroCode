public class User {
    String username;
    String email;
    int age;

    User(){
        this.username = "guest";
        this.email = "Not provided";
        this.age = 0;
    }
    User(String username){
        this.username = username;
        this.email = "Not provided";
        this.age = 0;
    }
    User(String username, String email){ //overloading constructor
        this.username = username;
        this.email = email;
        this.age = 0;
    
    }
    User(String username, String email, int age){ //overloading constructor
        this.username = username;
        this.email = email;
        this.age = age;
    }
    
}
