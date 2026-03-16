import java.util.HashMap;

public class HashTablePracticeApp {

    public static void main(String[] args) {

        HashMap<String,String> dnsCache = new HashMap<>();

        dnsCache.put("google.com","142.250.183.14");
        dnsCache.put("github.com","140.82.114.3");
        dnsCache.put("stackoverflow.com","151.101.65.69");

        String domain = "github.com";

        if(dnsCache.containsKey(domain)){
            System.out.println("IP Address: " + dnsCache.get(domain));
        } else {
            System.out.println("Domain not found");
        }
    }
}