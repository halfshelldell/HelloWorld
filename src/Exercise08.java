import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by illladell on 6/29/16.
 */
public class Exercise08 {
    public static void main(String[] args) throws IOException {
        // parse people.txt into Arraylist<String> that contain first and last name separated by a space
        // prompt the user for search term
        // print out the names that contain the term

        ArrayList<String> names = new ArrayList();
        File file = new File("person.txt");
        Scanner scanner = new Scanner(file);
        scanner.nextLine();
        while(scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] columns = line.split(",");
            String name = columns[1] + " " + columns[2];
            names.add(name);
        }

        Scanner consoleScanner = new Scanner(System.in);
        System.out.println("Type in search term:");
        String searchTerm = consoleScanner.nextLine();

        //String searchTerm = "mur";

        //solve via for loop
        for (String name : names) {
            if (name.toLowerCase().contains(searchTerm.toLowerCase())) {
                System.out.println(name);
            }
        }
        names.stream()
                .filter(name -> name.toLowerCase().contains(searchTerm.toLowerCase()))
                //.forEach(System.out::println);
                .collect(Collectors.toCollection(ArrayList<String>::new));
        System.out.println(names);
    }
}
