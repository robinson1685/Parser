import java.io.File;
import java.io.IOException;
import java.util.Scanner;

      /**
 * Created by Mark on 10/6/2015.
 */
public class FileTokenizer {
    public static void main(String[] args) throws Exception {
        String inFile = args[0];
        File file = new File(inFile);
        if (args[0] == null) {
            System.out.println("No file specified");
            System.exit(0);
        }


        if (args.length > 1) {
            inFile = args[0];
        }
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }
        sc.close();
        try {
            TokenReader t;
            while ((t = parser) != null) {
                //System.out.println(t.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
