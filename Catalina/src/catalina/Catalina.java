package catalina;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @Henderson Computer Science UIL team
 */
public class Catalina {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("catalina.dat"));
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String acro = "";
            for (int i = 0; i < line.length(); i++) {
                if ((line.charAt(i) + "").matches("\\p{Upper}")) {
                    acro = acro + line.charAt(i);
                }
            }
            System.out.println(acro);
        }
    }
}
