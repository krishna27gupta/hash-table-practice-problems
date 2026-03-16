import java.util.HashMap;

public class HashTablePracticeApp {

    public static void main(String[] args) {

        String text = "java is easy and java is powerful";

        String[] words = text.split(" ");

        HashMap<String,Integer> wordCount = new HashMap<>();

        for(String word : words){
            wordCount.put(word, wordCount.getOrDefault(word,0)+1);
        }

        System.out.println(wordCount);
    }
}