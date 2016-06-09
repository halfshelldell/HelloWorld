import java.util.ArrayList;


/**
 * Created by illladell on 6/9/16.
 */
public class Exercise05 {
    public static void main(String[] args) {
        String[] names = {"Charlie", "David", "Alice", "Bob", "Albert"};
        // ArrayList<String> sortNames
        ArrayList<String> sortNames = new ArrayList<>();
        for (String name : names) {
            int index = 0;
            for (String sortName : sortNames) {
                if (name.compareTo(sortName) > 0) {
                    index++;
                }
                else {
                    break;
                }
            }
            sortNames.add(index, name);
        }
        System.out.println(sortNames);
    }
}
