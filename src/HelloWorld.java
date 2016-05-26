import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by illladell on 5/18/16.
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ArrayList<String> names = new ArrayList<String>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        String name = names.get(0);

        HashMap<String, Integer> scores = new HashMap<String, Integer>();
        scores.put("Alice", 10);
        scores.put("Bob", 7);
        scores.put("Charlie", 3);

        int score = scores.get("Bob");
    }
}
/*
String[] names = new String[3];
//String Array
names[0] = "Alice";
names[1] = "Bob";
names[2] = "Charlie";
names

for(String name : names) {
    System.out.println(name);
}

int i = 0;
while (i < 5) {
    System.out.println("Hello");
    i +=1;
}

// Primitive
int score = 1;
double health = 100.0;
boolean isAlive = true;

// Class (Boxed)
String name =  "Alice";
Person p = new Person();
Integer.valueOf("123");
Double.valueOf("10.5");
// Boxed Class Examples
Integer score = 1;
Double health = 100.0;
Boolean isAlive = true;
*/

