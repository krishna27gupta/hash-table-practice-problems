import java.util.HashMap;

public class HashTablePracticeApp {

    public static void main(String[] args) {

        HashMap<String,String> cache = new HashMap<>();

        cache.put("user1","data1");
        cache.put("user2","data2");

        String key = "user1";

        if(cache.containsKey(key)){
            System.out.println("Cache hit: " + cache.get(key));
        } else {
            System.out.println("Cache miss");
        }
    }
}