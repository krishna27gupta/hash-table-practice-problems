import java.util.HashMap;

public class HashTablePracticeApp {

    public static void main(String[] args) {

        HashMap<String,Integer> queries = new HashMap<>();

        queries.put("java tutorial",5);
        queries.put("java hashmap",3);
        queries.put("java interview questions",8);

        for(String q : queries.keySet()){
            System.out.println(q + " -> " + queries.get(q));
        }
    }
}