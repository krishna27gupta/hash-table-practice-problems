import java.util.HashMap;

public class HashTablePracticeApp {

    public static void main(String[] args) {

        HashMap<String,Integer> requestCount = new HashMap<>();

        String user = "client1";

        requestCount.put(user, requestCount.getOrDefault(user,0)+1);

        if(requestCount.get(user) > 5){
            System.out.println("Rate limit exceeded");
        } else {
            System.out.println("Request allowed");
        }
    }
}