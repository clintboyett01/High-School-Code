import java.io.File;
import java.io.IOException;
import java.util.*;

/*
 * The following code solves the 2018 regional programming problems.
 *
 * Author - Clint Boyett
 * March 17, 2019
 *
 */

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Which class would you like to run?");
            System.out.println("Press type the number of the problem." +
                    "\nProblem 1 Ariana " +
                    "\nProblem 2 Bingwen " +
                    "\nProblem 3 Caleb " +
                    "\nProblem 4 Debra " +
                    "\nProblem 5 Emily " +
                    "\nProblem 6 Joe " +
                    "\nProblem 7 Opus " +
                    "\nProblem 8 Prashant " +
                    "\nProblem 9 Ramya " +
                    "\nProblem 10 Samantha " +
                    "\nProblem 11 Vincent " +
                    "\nProblem 12 William");
            System.out.println();
            int choice = sc.nextInt();
            System.out.println();
            switch (choice) {
                case 1:
                    Ariana ariana = new Ariana();
                    break;
                case 2:
                    Bingwen bingwen = new Bingwen();
                    break;
                case 3:
                    Caleb caleb = new Caleb();
                    break;
                case 4:
                    Debra debra = new Debra();
                    break;
                case 5:
                    Emily emily = new Emily();
                    break;
                case 6:
                    Joe joe = new Joe();
                    break;
                case 7:
                    Opus opus = new Opus();
                    break;
                case 8:
                    Prashant prashant = new Prashant();
                    break;
                case 9:
                    Ramya ramya = new Ramya();
                    break;
                case 10:
                    Samantha samantha = new Samantha();
                    break;
                case 11:
                    Vincent vincent = new Vincent();
                    break;
                case 12:
                    William william = new William();
                    break;
                default:
                    System.out.println("Try again");
            }
            System.out.println();
        }
    }
}

class Ariana {
    Ariana() throws IOException {
        for (int i = 1; i < 40; i++) {
            for (int j = 0; j < 5; j++) {
                if (i > 40) break;
                String[] arr = new String[]{"i", "must", "not", "tell", "lies"};
                arr[j] = arr[j].toUpperCase();
                System.out.printf("%n%-2d %s %s %s %s %s.", i, arr[0], arr[1], arr[2], arr[3], arr[4]);
                i++;
            }
            for (int j = 3; j > 0; j--) {
                if (i > 40) break;
                String[] arr = new String[]{"i", "must", "not", "tell", "lies"};
                arr[j] = arr[j].toUpperCase();
                System.out.printf("%n%-2d %s %s %s %s %s.", i + j, arr[0], arr[1], arr[2], arr[3], arr[4]);
                i++;
            }

        }
    }
}

class Bingwen {
    Bingwen() throws IOException {
        Scanner sc = new Scanner(new File("bingwen.dat"));
        while (sc.hasNext()) {
            double original = sc.nextInt();
            double cubeRoot = Math.cbrt(original);
            System.out.printf("%.2f%n", cubeRoot);
        }
    }
}

class Caleb {
    Caleb() throws IOException {
        Scanner sc = new Scanner(new File("caleb.dat"));
        int count = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < count; i++) {
            String line = sc.nextLine();
            int hour = Integer.parseInt(line.substring(0, line.indexOf("/")));
            int min = Integer.parseInt(line.substring(line.indexOf("/") + 1));
            hour /= 30;
            min /= 6;
            if (hour == 0) {
                hour = 12;
            }
            System.out.printf("%d:%02d%n", hour, min);
        }
    }
}

class Debra {
    Debra() throws IOException {
        Scanner sc = new Scanner(new File("debra.dat"));
        while (sc.hasNext()) {
            int height = sc.nextInt();
            int width = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < height; i++) {
                String line = sc.nextLine();
                StringBuffer sb = new StringBuffer(line);
                sb.reverse();
                System.out.println(sb.toString());
            }
            System.out.println("=====");
        }

    }
}

class Emily {
    int[][] arr;
    int arrSize;
    ArrayList<String> locations;

    Emily() throws IOException {
        Scanner sc = new Scanner(new File("Emily.dat"));
        arrSize = sc.nextInt();
        sc.nextLine();
        arr = new int[arrSize][arrSize];
        for (int i = 0; i < arrSize; i++) {
            for (int j = 0; j < arrSize; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        ArrayList<Integer> al = new ArrayList<>();
        while (sc.hasNextInt()) {
            al.add(sc.nextInt());
        }
        for (int el : al) {
            check(el);
        }
    }

    public void check(int num) {
        String str = "" + num;
        int[] digits = new int[str.length()];
        int index = 0;
        locations = new ArrayList<>();
        for (char el : str.toCharArray()) {
            digits[index] = Integer.parseInt("" + el);
            index++;
        }
        for (int i = 0; i < arrSize; i++) {
            for (int j = 0; j < arrSize; j++) {
                if (arr[i][j] == digits[0]) {
                    checkDirections(i, j, digits);
                }
            }
        }
        System.out.println("<" + num + ">");
        if (locations.isEmpty()) {
            System.out.println("NOT FOUND");
        } else {
            locationSorter locationSorter = new locationSorter();
            Collections.sort(locations, locationSorter);
            for (String el : locations) {
                System.out.println(el);
            }
        }
    }

    public void checkDirections(int x, int y, int[] digits) {
        String xy = "(" + (1 + x) + "," + (1 + y) + ") ";
        if (checkNorth(x, y, digits)) {
            locations.add(xy + "N");
        }
        if (checkNorthEast(x, y, digits)) {
            locations.add(xy + "NE");
        }
        if (checkEast(x, y, digits)) {
            locations.add(xy + "E");
        }
        if (checkSouthEast(x, y, digits)) {
            locations.add(xy + "SE");
        }
        if (checkSouth(x, y, digits)) {
            locations.add(xy + "S");
        }
        if (checkSouthWest(x, y, digits)) {
            locations.add(xy + "SW");
        }
        if (checkWest(x, y, digits)) {
            locations.add(xy + "W");
        }
        if (checkNorthWest(x, y, digits)) {
            locations.add(xy + "NW");
        }


    }

    public boolean checkNorth(int x, int y, int[] digits) {
        if (digits.length == 0) {
            return true;
        }
        if (x == -1) {
            x = arrSize - 1;
        }
        if (arr[x][y] == digits[0]) {
            return checkNorth(x - 1, y, trimOffFirst(digits));
        }
        return false;
    }

    public boolean checkSouth(int x, int y, int[] digits) {
        if (digits.length == 0) {
            return true;
        }
        if (x == arrSize) {
            x = 0;
        }
        if (arr[x][y] == digits[0]) {
            return checkSouth(x + 1, y, trimOffFirst(digits));
        }
        return false;
    }

    public boolean checkEast(int x, int y, int[] digits) {
        if (digits.length == 0) {
            return true;
        }
        if (y == arrSize) {
            y = 0;
        }
        if (arr[x][y] == digits[0]) {
            return checkEast(x, y + 1, trimOffFirst(digits));
        }
        return false;
    }

    public boolean checkWest(int x, int y, int[] digits) {
        if (digits.length == 0) {
            return true;
        }
        if (y == -1) {
            y = arrSize - 1;
        }
        if (arr[x][y] == digits[0]) {
            return checkWest(x, y - 1, trimOffFirst(digits));
        }
        return false;
    }

    public boolean checkNorthEast(int x, int y, int[] digits) {
        if (digits.length == 0) {
            return true;
        }
        if (y == arrSize) {
            y = 0;
        }
        if (x == -1) {
            x = arrSize - 1;
        }
        if (arr[x][y] == digits[0]) {
            return checkNorthEast(x - 1, y + 1, trimOffFirst(digits));
        }
        return false;
    }

    public boolean checkNorthWest(int x, int y, int[] digits) {
        if (digits.length == 0) {
            return true;
        }
        if (y == -1) {
            y = arrSize - 1;
        }
        if (x == -1) {
            x = arrSize - 1;
        }
        if (arr[x][y] == digits[0]) {
            return checkNorthWest(x - 1, y - 1, trimOffFirst(digits));
        }
        return false;
    }

    public boolean checkSouthEast(int x, int y, int[] digits) {
        if (digits.length == 0) {
            return true;
        }
        if (y == arrSize) {
            y = 0;
        }
        if (x == arrSize) {
            x = 0;
        }
        if (arr[x][y] == digits[0]) {
            return checkSouthEast(x + 1, y + 1, trimOffFirst(digits));
        }
        return false;
    }

    public boolean checkSouthWest(int x, int y, int[] digits) {
        if (digits.length == 0) {
            return true;
        }
        if (y == -1) {
            y = arrSize - 1;
        }
        if (x == arrSize) {
            x = 0;
        }
        if (arr[x][y] == digits[0]) {
            return checkSouthWest(x + 1, y - 1, trimOffFirst(digits));
        }
        return false;
    }

    public int[] trimOffFirst(int[] numArr) {
        int[] temp = new int[numArr.length - 1];
        for (int i = 1; i < numArr.length; i++) {
            temp[i - 1] = numArr[i];
        }
        return temp;
    }

    class locationSorter implements Comparator {


        public int compare(Object s1, Object s2) {
            String str = (String) s1;
            String temp = (String) s2;
            int thisDir = 0;
            int otherDir = 0;
            if (str.substring(str.lastIndexOf(" ") + 1).equals("N")) {
                thisDir = 1;
            }
            if (str.substring(str.lastIndexOf(" ") + 1).equals("NE")) {
                thisDir = 2;
            }
            if (str.substring(str.lastIndexOf(" ") + 1).equals("E")) {
                thisDir = 3;
            }
            if (str.substring(str.lastIndexOf(" ") + 1).equals("SE")) {
                thisDir = 4;
            }
            if (str.substring(str.lastIndexOf(" ") + 1).equals("S")) {
                thisDir = 5;
            }
            if (str.substring(str.lastIndexOf(" ") + 1).equals("SW")) {
                thisDir = 6;
            }
            if (str.substring(str.lastIndexOf(" ") + 1).equals("W")) {
                thisDir = 7;
            }
            if (str.substring(str.lastIndexOf(" ") + 1).equals("NW")) {
                thisDir = 8;
            }
            if (temp.substring(temp.lastIndexOf(" ") + 1).equals("N")) {
                otherDir = 1;
            }
            if (temp.substring(temp.lastIndexOf(" ") + 1).equals("NE")) {
                otherDir = 2;
            }
            if (temp.substring(temp.lastIndexOf(" ") + 1).equals("E")) {
                otherDir = 3;
            }
            if (temp.substring(temp.lastIndexOf(" ") + 1).equals("SE")) {
                otherDir = 4;
            }
            if (temp.substring(temp.lastIndexOf(" ") + 1).equals("S")) {
                otherDir = 5;
            }
            if (temp.substring(temp.lastIndexOf(" ") + 1).equals("SW")) {
                otherDir = 6;
            }
            if (temp.substring(temp.lastIndexOf(" ") + 1).equals("W")) {
                otherDir = 7;
            }
            if (temp.substring(temp.lastIndexOf(" ") + 1).equals("NW")) {
                otherDir = 8;
            }
            if (otherDir != thisDir) {
                return thisDir - otherDir;
            }
            int f1 = str.substring(1, str.indexOf(",")).compareTo(temp.substring(1, temp.indexOf(",")));
            if (f1 != 0) {
                return f1;
            }
            int f2 = str.substring(str.indexOf(",")).compareTo(temp.substring(temp.indexOf(",")));
            if (f2 != 0) {
                return f2;
            }
            return 0;
        }
    }
}

class Joe {
    Joe() throws IOException {
        Scanner sc = new Scanner(new File("joe.dat"));
        while (sc.hasNext()) {
            String[] words = sc.nextLine().split(" ");
            ArrayList<String> al = new ArrayList<>();
            for (String word : words) {
                String temp = "";
                for (char letter : word.toCharArray()) {
                    if (Character.isAlphabetic(letter)) {
                        temp += Character.toUpperCase(letter);
                    }
                }
                al.add(temp);
            }
            Sorter sort = new Sorter();
            Collections.sort(al, sort);
            for (String word : al) {
                System.out.print(word + " ");
            }
            System.out.println();
        }
    }

    class Sorter implements Comparator {
        public int compare(Object o1, Object o2) {
            String s1 = (String) o1;
            String s2 = (String) o2;
            if (s1.length() != s2.length()) {
                return s1.length() - s2.length();
            }
            return s1.compareTo(s2);
        }
    }
}

class Opus {
    Opus() throws IOException {
        Scanner sc = new Scanner(new File("opus.dat"));
        String s = sc.nextLine();
        String[] key = s.substring(s.indexOf(" ") + 1).split(" ");
        ArrayList<Contestant> al = new ArrayList<>();
        int[] size = {0, 0, 0, 0, 0, 0};

        System.out.println();
        while (sc.hasNext()) {
            String firstName = sc.next();
            String lastName = sc.next();
            String schoolName = sc.next();
            String schoolSize = sc.next();
            int numberAttempted = 40;
            int score = 0;


            for (int i = 0; i < 40; i++) {
                String answer = sc.next();
                if (answer.equals("S")) {
                    numberAttempted--;
                } else if (answer.equals(key[i])) {
                    score += 6;
                } else {
                    score -= 2;
                }
            }
            size[Integer.parseInt(schoolSize.substring(0, 1)) - 1]++;
            al.add(new Contestant(firstName, lastName, schoolName, schoolSize, numberAttempted, score));
            Sorter sorter = new Sorter();
            Collections.sort(al, sorter);
        }
        int in = 0;
        for (int el : size) {
            in++;
            if (el != 0) {
                System.out.println(in + "A");
                Contestant prev = null;
                for (int i = 0; i < el; i++) {
                    Contestant temp = al.remove(0);
                    int add = 1;
                    if (i > 0) {
                        if (temp.score == prev.score && temp.numberAttempted == prev.numberAttempted) {
                            add--;
                        }
                    }
                    System.out.println(i + add + " " + temp.lastName + ", " + temp.firstName + " - " + temp.schoolName + ": " + temp.score);
                    prev = temp;
                }
            }
        }

    }

    class Contestant {
        String firstName;
        String lastName;
        String schoolName;
        String schoolSize;
        int numberAttempted;
        int score;

        Contestant(String firstName, String lastName, String schoolName, String schoolSize, int numberAttempted, int score) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.schoolName = schoolName;
            this.schoolSize = schoolSize;
            this.numberAttempted = numberAttempted;
            this.score = score;
        }
    }

    class Sorter implements Comparator<Contestant> {

        public int compare(Contestant c1, Contestant c2) {

            if (!c1.schoolSize.equals(c2.schoolSize)) {
                return c1.schoolSize.compareTo(c2.schoolSize);
            }
            if (c1.score != c2.score) {
                return c2.score - c1.score;
            }
            if (c1.numberAttempted != c2.numberAttempted) {
                return c1.numberAttempted - c2.numberAttempted;
            }
            if (!c1.lastName.equals(c2.lastName)) {
                return c1.lastName.compareTo(c2.lastName);
            }
            if (!c1.firstName.equals(c2.firstName)) {
                return c1.firstName.compareTo(c2.firstName);
            }
            return 0;
        }
    }
}

class Prashant {
    Prashant() throws IOException {
        Scanner sc = new Scanner(new File("prashant.dat"));
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] arr = line.split(" ");
            int num = arr.length;
            ArrayList<String> al = new ArrayList<>();
            for (String el : arr) {
                al.add(el);
            }
            int denum = 1;
            while (!al.isEmpty()) {
                int number = 1;
                String t = al.remove(0);
                while (al.contains(t)) {
                    al.remove(t);
                    number++;
                }
                denum *= fact(number);
            }
            num = fact(num);
            System.out.println(num / denum);
        }
    }

    int fact(int num) {
        if (num < 1) {
            return 1;
        }
        return num * fact(num - 1);
    }
}

class Ramya {
    TreeSet<String> treeSet = new TreeSet<>();

    Ramya() throws IOException {
        Scanner sc = new Scanner(new File("ramya.dat"));
        while (sc.hasNext()) {
            String line = sc.nextLine();
            getPerm(line);
            int index = 0;
            for (String el : treeSet) {
                if (index == 30) {
                    break;
                }
                System.out.println(el);
                index++;
            }

            System.out.println("=====");
            treeSet = new TreeSet<>();
        }
    }

    void getPerm(String str) {
        ArrayList<Character> al = new ArrayList<>();
        char[] arr = str.toCharArray();
        for (char el : arr) {
            al.add(el);
        }
        for (int i = 0; i < 10000; i++) {
            Collections.shuffle(al);
            String temp = "";
            for (char el : al) {
                temp += el;
            }
            treeSet.add(temp);
        }

    }
}

class Samantha {
    Samantha() throws IOException {
        Scanner sc = new Scanner(new File("samantha.dat"));
        while (sc.hasNext()) {
            String[] arr = sc.nextLine().split(" ");
            double total = 0;
            for (String el : arr) {
                total += Double.parseDouble(el);
            }
            System.out.printf("Subtotal: $ %6.2f%n", total);
            System.out.printf("tax     : $ %6.2f%n", total * 0.0825);
            System.out.printf("Total   : $ %6.2f%n", total + total * 0.0825);
            System.out.println("=====");
        }
    }
}

class Vincent {
    Vincent() throws IOException {
        Scanner sc = new Scanner(new File("vincent.dat"));
        while (sc.hasNext()) {
            int year = sc.nextInt();
            int month = sc.nextInt();
            int day = sc.nextInt();
            int hour = sc.nextInt();
            int minute = sc.nextInt();
            GregorianCalendar calendar = new GregorianCalendar();
            calendar.set(year, month - 1, day, hour, minute);
            System.out.printf("%tB %td, %tY - %tI:%tM %Tp%n", calendar, calendar, calendar, calendar, calendar, calendar);
            sc.nextLine();
            System.out.println("-----");
            String[] arr = sc.nextLine().split(" ");
            for (String el : arr) {
                calendar.set(year, month - 1, day, hour, minute + Integer.parseInt(el));
                System.out.printf("%tB %td, %tY - %tI:%tM %Tp%n", calendar, calendar, calendar, calendar, calendar, calendar);
            }
            System.out.println("=====");
        }
    }


}

class William {
    William() {
        System.out.println("Unfinished. I ran out of time.");
    }
}


