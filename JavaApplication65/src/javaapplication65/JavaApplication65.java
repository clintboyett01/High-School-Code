package javaapplication65;

import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class JavaApplication65 {

    public static void main(String[] args) throws IOException {

        
        Scanner sc = new Scanner(new File("beautiful.dat"));

        int c = sc.nextInt();
        sc.nextLine();

        for (int x = 0; x < c; x++) {

            String s = sc.nextLine();
            String g[] = s.split(" ");
            int tot = Integer.parseInt(g[1]);
            for (int j = 0; j < tot / 2; j++) {
                System.out.print(" ");
            }
            System.out.println(g[0]);
            for (int i = tot / 2 - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.print(g[0]);
                int m = (tot / 2) - i;
                for (int j = 0; j < m * 2 - 1; j++) {
                    System.out.print(" ");
                }
                System.out.println(g[0]);
            }
//            System.out.print(g[0]);
//            for (int i = 0; i < tot-2; i++) {
//                System.out.print(" ");
//            }
//            System.out.println(g[0]);
            for (int i = 0; i < tot / 2 ; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.print(g[0]);
                int m = (tot / 2) - i;
                for (int j = 0; j < m * 2 - 1; j++) {
                    System.out.print(" ");
                }
                System.out.println(g[0]);
            }
            for (int j = 0; j < tot / 2; j++) {
                System.out.print(" ");
            }
            System.out.println(g[0]);
        }
    }

}
