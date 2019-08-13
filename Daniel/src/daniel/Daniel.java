package daniel;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Henderson Computer Science UIL team
 */
public class Daniel {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(new File("daniel.dat"));
        while (sc.hasNext()) {
            process(sc.nextLine());
        }
    }
    public static ArrayList<String> al = new ArrayList<>();

    public static void process(String line) {

        String temp[] = line.split(" ");
        for (String el : temp) {
            al.add(el);
        }

        int index = 1;
        while (al.size() > 0) {
            String printLine = getString(index);
            index = print(printLine, index);
            index++;
        }
        System.out.println("_________*_________*_________*");
    }

    public static int print(String printLine, int index) {
       printLine = printLine.trim();
        if (printLine.length() <= 30) {

            System.out.println(printLine);
            remove(index);
            
        } else {
            overflowHandler(printLine, index);
            index = 0;
        }
        return index;
    }
    
    public static void overflowHandler(String line, int index){
        index--;
        line = line.substring(0,line.lastIndexOf(" "));
        print(line,index);
    }

    public static String getString(int index) {
        String line = "";
        for (int i = 0; i < index; i++) {
            if (al.size() - 1 < i) {
                break;
            }
            line += " " + al.get(i);
        }
        return line;
    }

    public static void remove(int index) {
        for (int i = 0; i < index; i++) {
           if(!al.isEmpty()){
            al.remove(0);
           }
        }
    }

}
