import java.util.HashMap;

public class HashTablePracticeApp {

    public static void main(String[] args) {

        HashMap<String,Integer> users = new HashMap<>();

        users.put("john_doe",1);
        users.put("alice",2);

        String username = "john_doe";

        if(users.containsKey(username)){
            System.out.println("Username already taken");
        } else {
            System.out.println("Username available");
        }

    }
}