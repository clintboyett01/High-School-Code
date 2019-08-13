import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        Scanner first = new Scanner(new File("firstName"));
        Scanner last = new Scanner(new File("lastName"));

        for (int i = 0; i < 600; i++) {

            Random r = new Random();
            int ran = r.nextInt(5);
            String mid = "";

            switch (ran) {
                case 0:
                    mid += ".";
                    break;
                case 1:
                    mid += (char) (r.nextInt(26) + 65);
                    break;
                case 2:
                    mid += r.nextInt(10);
                    break;
                case 3:
                    mid += "";
                    break;
                case 4:
                    mid += ".";
                    break;
            }

            int ran2 = r.nextInt(5);
            String email = "";


            switch (ran2) {
                case 0:
                    email += "gmail.com";
                    break;
                case 1:
                    email += "yahoo.com";
                    break;
                case 2:
                    email += "outlook.com";
                    break;
                case 3:
                    email += "inbox.com";
                    break;
                case 4:
                    email += "mail.com";
                    break;
            }

            String fname = first.nextLine().trim();
            String lname = last.nextLine().trim();
            String fullEmail = fname + mid + lname + "@" + email;

            System.out.println(fname);
            System.out.println(lname);
            System.out.println(fullEmail.toLowerCase());
            System.out.println();
        }
    }
}
