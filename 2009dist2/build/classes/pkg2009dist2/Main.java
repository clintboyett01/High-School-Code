package pkg2009dist2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("First\n\n");
        one one = new one();
        System.out.println("\n\nSecond\n\n");
        two two = new two();
        System.out.println("\n\nThird\n\n");
        three three = new three();
        System.out.println("\n\nFourth\n\n");
        four four = new four();
        System.out.println("\n\nSixth\n\n");
        six six = new six();
        
        StringBuilder sb = new StringBuilder();
        String c = "clint";
       
        sb.append(c);
        System.out.println(sb.reverse());
    }

}

class peep{
    String name;
    int age;
}

class one {

    one() throws IOException {
        Scanner sc = new Scanner(new File("candy.dat"));
        int count = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < count; i++) {
            String line = sc.nextLine();
            String carr[] = line.split(" ");
            int narr[] = new int[carr.length];
            for (int j = 0; j < carr.length; j++) {
                narr[j] = Integer.parseInt(carr[j]);
                for (int k = 0; k < 10; k++) {

                }
            }
            int tot = 0;
            for (int el : narr) {
                tot += el;
            }
            double avg = tot / carr.length;
            double pattys = tot - (Math.floor(avg) * carr.length);
            for (int el : narr) {
                System.out.print((int) (Math.floor(avg) - el) + " ");

            }
            System.out.println(((int) pattys));

        }
        sc.close();
    }
}

class two {

    two() throws IOException {
        Scanner sc = new Scanner(new File("code2.dat"));
        int count = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < count; i++) {
            String line = sc.nextLine();
            int size = (int) Math.ceil(Math.sqrt(line.length()));
            char matrix[][] = new char[size][size];
            int place = 0;
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    matrix[j][k] = line.charAt(place);
                    place++;
                }
            }
            for (int j = 0; j < size; j++) {
                for (int k = size - 1; k >= 0; k--) {
                    System.out.print(matrix[k][j]);
                }
            }
            System.out.println("");
        }
        sc.close();
    }
}

class three {

    three() {
        System.out.println("******************************"
                + "\n*    *************************"
                + "\n****    **********************"
                + "\n*******    *******************"
                + "\n**********    ****************"
                + "\n*************    *************"
                + "\n****************    **********"
                + "\n*******************    *******"
                + "\n**********************    ****"
                + "\n*************************    *"
                + "\n**********************    ****"
                + "\n*******************    *******"
                + "\n****************    **********"
                + "\n*************    *************"
                + "\n**********    ****************"
                + "\n*******    *******************"
                + "\n****    **********************"
                + "\n*    *************************"
                + "\n****    **********************"
                + "\n*******    *******************"
                + "\n**********    ****************"
                + "\n*************    *************"
                + "\n****************    **********"
                + "\n*******************    *******"
                + "\n**********************    ****"
                + "\n*************************    *"
                + "\n****************************** ");
    }
}

class four {

    four() throws IOException {
        Scanner sc = new Scanner(new File("petals.dat"));
        int count = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; i++) {

            int pet = 0;
            for (int j = 0; j < 5; j++) {
                String line = sc.nextLine() + sc.nextLine() + sc.nextLine() + sc.nextLine() + sc.nextLine();

                switch (line) {
                    case ("-------"
                    + "|     |"
                    + "|  o  |"
                    + "|     |"
                    + "-------"):
                        break;
                    case ("-------"
                    + "| o   |"
                    + "|     |"
                    + "|   o |"
                    + "-------"):
                        break;
                    case ("-------"
                    + "| o   |"
                    + "|  o  |"
                    + "|   o |"
                    + "-------"):
                        pet += 2;
                        break;
                    case ("-------"
                    + "| o o |"
                    + "|     |"
                    + "| o o |"
                    + "-------"):
                        break;
                    case ("-------"
                    + "| o o |"
                    + "|  o  |"
                    + "| o o |"
                    + "-------"):
                        pet += 4;
                        break;
                    case ("-------"
                    + "| o o |"
                    + "| o o |"
                    + "| o o |"
                    + "-------"):
                        break;
                }
            }
            System.out.println(pet);
        }
    }
}

class six {

    six() throws IOException {
        Scanner sc = new Scanner(new File("transform.dat"));
        int lc = -1;
        int count = sc.nextInt();
        for (int i = 0; i < count+1; i++) {
            String line = sc.nextLine();
            lc++;
            char carr[] = line.toCharArray();
            int arr[] = new int[carr.length];
            for (int j = 0; j < carr.length; j++) {
                arr[j] = carr[j];
            }
            if (lc % 4 == 1) {
                print2(arr);
            }
            if (lc % 4 == 2) {
                print3(arr);
            }
            if (lc % 4 == 3) {
                print5(arr);
            }
            if (lc % 4 == 0) {
                print7(arr);
            }
            System.out.println("");
        }
    }

    void print2(int arr[]) {
        for (int num : arr) {
            Stack<Integer> s = new Stack<>();
            while (num > 0) {
                s.add(num % 2);
                num /= 2;
            }
            while (!s.empty()) {
                System.out.print(s.pop());
            }
            System.out.print("_");
        }
    }

    void print3(int arr[]) {
        for (int num : arr) {
            Stack<Integer> s = new Stack<>();
            while (num > 0) {
                s.add(num % 3);
                num /= 3;
            }
            while (!s.empty()) {
                System.out.print(s.pop());
            }
            System.out.print("_");
        }
    }

    void print5(int arr[]) {
        for (int num : arr) {
            Stack<Integer> s = new Stack<>();
            while (num > 0) {
                s.add(num % 5);
                num /= 5;
            }
            while (!s.empty()) {
                System.out.print(s.pop());
            }
            System.out.print("_");
        }
    }

    void print7(int arr[]) {
        for (int num : arr) {
            Stack<Integer> s = new Stack<>();
            while (num > 0) {
                s.add(num % 7);
                num /= 7;
            }
            while (!s.empty()) {
                System.out.print(s.pop());
            }
            System.out.print("_");
        }
    }

}
