import java.util.HashMap;

public class HashTablePracticeApp {

    public static void main(String[] args) {

        HashMap<String,Integer> pageViews = new HashMap<>();

        pageViews.put("/home",150);
        pageViews.put("/products",90);
        pageViews.put("/contact",30);

        for(String page : pageViews.keySet()){
            System.out.println(page + " views: " + pageViews.get(page));
        }
    }
}