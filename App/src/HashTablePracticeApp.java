import java.util.HashMap;

public class HashTablePracticeApp {

    public static void main(String[] args) {

        HashMap<Integer,String> parking = new HashMap<>();

        parking.put(1,"TN10AB1234");
        parking.put(2,"TN09XY5678");

        int slot = 1;

        if(parking.containsKey(slot)){
            System.out.println("Car parked: " + parking.get(slot));
        } else {
            System.out.println("Slot empty");
        }
    }
}