import java.util.HashMap;

public class HashTablePracticeApp {

    public static void main(String[] args) {

        int[] arr = {10,20,30,40};
        int target = 50;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){

            int complement = target - arr[i];

            if(map.containsKey(complement)){
                System.out.println("Pair found: " + complement + " + " + arr[i]);
                return;
            }

            map.put(arr[i],i);
        }

        System.out.println("No pair found");
    }
}