package studyhelper;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Clint
 */
public class StudyHelper {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        controlFile cf = new controlFile();
        boolean endProgram = false;
        while (!endProgram) {
            System.out.println("Please enter a command. For help please type\"HELP\"");
            String choice = sc.nextLine();
            switch (choice) {
                case "Current Data":
                    cf.printData();
                    break;
                case "HELP":
                    System.out.println("Here is a list of availible options\n");
                    System.out.println("Current Data- Displays Current Data");
                    System.out.println("HELP-Gets help");
                    System.out.println("End-Ends program");
                    System.out.println("");
                    break;
                case "End":
                    endProgram = true;
                    break;
                default:
                    System.out.println("Please Enter A Valid Option");
            }
        }
    }
}
