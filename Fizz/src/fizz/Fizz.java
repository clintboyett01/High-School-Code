package fizz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Clint
 */
public class Fizz {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("fizz.dat"));

        int count = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.println("Data Set " + (i + 1));
            int start = sc.nextInt();
            int end = sc.nextInt();
            sc.nextLine();

            for (int j = start; j <= end; j++) {
                if (j % 3 == 0) {
                    if (j % 5 == 0) {
                        System.out.println("FizzBang");
                    } else {
                        System.out.println("Fizz");
                    }
                } else if (j % 5 == 0) {
                    System.out.println("Bang");
                } else {
                    System.out.println(j);
                }
            }
        }

    }

}
