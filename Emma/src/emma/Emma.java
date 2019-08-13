package emma;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @Henderson Computer Science UIL team
 */
public class Emma {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("emma.dat"));
        while (sc.hasNextInt()) {
            int x = sc.nextInt();
            for (int v = 0; v < x; v++) {
                for (int i = 0; i < x; i++) {
                    System.out.print("*");
                }
                for (int i = 0; i < x; i++) {
                    System.out.print(" ");
                }
                for (int i = 0; i < x; i++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
            for (int i = 0; i < x / 2; i++) {
                for (int j = 0; j < x; j++) {
                    System.out.print(" ");
                }

                for (int k = 0; k < i; k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int k = 0; k < x - (i*2) - 2; k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int k = 0; k < i; k++) {
                    System.out.print(" ");
                }

                for (int j = 0; j < x; j++) {
                    System.out.print(" ");
                }
                System.out.println("");
            }
            if (x % 2 == 1) {
                for (int i = 0; i < x + (x / 2); i++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int i = 0; i < x + (x / 2); i++) {
                    System.out.print(" ");
                }
                System.out.println("");
            }
            for (int i = x/2; i > 0 ; i--) {
                for (int j = 0; j < x; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < i-1; k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int k = 0; k < x - (i*2); k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int k = 0; k < i-1; k++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < x; j++) {
                    System.out.print(" ");
                }
                System.out.println("");
            }
            for (int v = 0; v < x; v++) {
                for (int i = 0; i < x; i++) {
                    System.out.print("*");
                }
                for (int i = 0; i < x; i++) {
                    System.out.print(" ");
                }
                for (int i = 0; i < x; i++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
            System.out.println("==========");
        }
    }

}
