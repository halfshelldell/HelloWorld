import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by illladell on 5/25/16.
 */
public class ReadWriteFile {
    public static void main(String[] args) throws IOException {
        File f = new File("name.txt");

        FileWriter fw = new FileWriter(f);
        // use when wanting to make it crash use exception
        // to handle it use try/catch
        fw.write("Alice\n"); // this will overwrite the file, if it exist
        fw.append("Bob\n");
        fw.append("Charlie\n");
        fw.close();

        // read line by line
        Scanner scanner = new Scanner(f);
        while(scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }

        // read entire file
        scanner = new Scanner(f);
        scanner.useDelimiter("\\Z");
        System.out.println(scanner.next());

        //
    }
}
