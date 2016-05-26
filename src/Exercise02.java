import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by illladell on 5/26/16.
 */
public class Exercise02 {
    public static void main(String[] args) {
        Email e1 = new Email("Hi", "", "alice@gmail.com");
        Email e2 = new Email("Hi", "", "bob@gmail.com");
        Email e3 = new Email("Hi", "", "charlie@gmail.com");
        Email e4 = new Email("Hi", "", "alice@gmail.com");
        Email e5 = new Email("Hi", "", "bob@gmail.com");

        Email[] emails = {e1, e2, e3, e4, e5};

        // HashMap organizing the emails by destination
        // "alice@gmail.com" -> [e1, e4]
        // "bob@gmail.com" -> [e2, e5]
        // "charlie@gmail.com" -> [e3]

        HashMap<String, ArrayList<Email>> map = new HashMap<>();
        for (Email email : emails) {
           ArrayList<Email> arrayList = map.get(email.destination);
           if(arrayList == null) {
               arrayList = new ArrayList<>();
               arrayList.add(email);
               map.put(email.destination, arrayList);
           }
           else {
               arrayList.add(email);
           }
        }
        System.out.println(map);

        // Alternative Solution
        map = new HashMap<>();
        for (Email email : emails) {
            if (!map.containsKey(email.destination)) {
                map.put(email.destination, new ArrayList<>());
            }
            ArrayList<Email> arrayList = map.get(email.destination);
            arrayList.add(email);
        }
        System.out.println(map);
    }
}
