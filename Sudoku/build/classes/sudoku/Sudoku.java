package sudoku;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sudoku {

    public static void main(String[] args) throws FileNotFoundException {
        SudokuSolver ss = new SudokuSolver();
    }

}

class SudokuSolver {

    int sudoku[][] = new int[9][9];

    SudokuSolver() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("sudoku.dat"));
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int num = sc.nextInt();
                sudoku[i][j] = num;
            }
            sc.nextLine();
        }
        System.out.println(sudoku[2][3]);
        print();
        while (!complete()) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (sudoku[i][j] == 0) {
                        int vert[] = getVert(j);
                        if (vert.length == 1) {
                            sudoku[i][j] = vert[0];
                        }
                        int horz[] = getHorz(i);
                        if (vert.length == 1) {
                            sudoku[i][j] = horz[0];
                        }
                        int group[] = getGroup(i, j);
                        if (vert.length == 1) {
                            sudoku[i][j] = group[0];
                        }
                        int fin[] = getCommon(vert, horz, group);
                        if (fin.length == 1) {
                            sudoku[i][j] = fin[0];
                        }
                    }
                }
            }
        }
        
    }
    void print(){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println("");
        }
    }
    int[] getCommon(int a[], int b[], int c[]) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                for (int k = 0; k < c.length; k++) {
                    if (a[i] == b[j] && b[j] == c[k]) {
                        al.add(a[i]);
                    }
                }
            }
        }
        int arr[] = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            arr[i] = al.get(i);
        }
        return arr;
    }

    int[] getHorz(int j) {
        int list[] = sudoku[j];
        ArrayList<Integer> al = new ArrayList<>();
        if (!contains(1, list)) {
            al.add(1);
        }
        if (!contains(2, list)) {
            al.add(2);
        }
        if (!contains(3, list)) {
            al.add(3);
        }
        if (!contains(4, list)) {
            al.add(4);
        }
        if (!contains(5, list)) {
            al.add(5);
        }
        if (!contains(6, list)) {
            al.add(6);
        }
        if (!contains(7, list)) {
            al.add(7);
        }
        if (!contains(8, list)) {
            al.add(8);
        }
        if (!contains(9, list)) {
            al.add(9);
        }
        int arr[] = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            arr[i] = al.get(i);
        }
        return arr;
    }

    int[] getVert(int k) {
        int list[] = new int[9];
        for (int i = 0; i < 9; i++) {
            list[i] = sudoku[i][k];
        }
        ArrayList<Integer> al = new ArrayList<>();
        if (!contains(1, list)) {
            al.add(1);
        }
        if (!contains(2, list)) {
            al.add(2);
        }
        if (!contains(3, list)) {
            al.add(3);
        }
        if (!contains(4, list)) {
            al.add(4);
        }
        if (!contains(5, list)) {
            al.add(5);
        }
        if (!contains(6, list)) {
            al.add(6);
        }
        if (!contains(7, list)) {
            al.add(7);
        }
        if (!contains(8, list)) {
            al.add(8);
        }
        if (!contains(9, list)) {
            al.add(9);
        }
        int arr[] = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            arr[i] = al.get(i);
        }
        return arr;
    }

    int[] getGroup(int j, int k) {
        int list[] = new int[9];
        if (j < 3) {
            if (k < 3) {
                int tot = 0;
                for (int i = 0; i < 3; i++) {
                    for (int l = 0; l < 3; l++) {
                        list[tot] = sudoku[i][l];
                        tot++;
                    }
                }
            } else if (k < 6) {
                int tot = 0;
                for (int i = 0; i < 3; i++) {
                    for (int l = 3; l < 6; l++) {
                        list[tot] = sudoku[i][l];
                        tot++;
                    }
                }
            } else {
                int tot = 0;
                for (int i = 0; i < 3; i++) {
                    for (int l = 6; l < 9; l++) {
                        list[tot] = sudoku[i][l];
                        tot++;
                    }
                }
            }
        } else if (j < 6) {
            if (k < 3) {
                int tot = 0;
                for (int i = 3; i < 6; i++) {
                    for (int l = 0; l < 3; l++) {
                        list[tot] = sudoku[i][l];
                        tot++;
                    }
                }
            } else if (k < 6) {
                int tot = 0;
                for (int i = 3; i < 6; i++) {
                    for (int l = 3; l < 6; l++) {
                        list[tot] = sudoku[i][l];
                        tot++;
                    }
                }
            } else {
                int tot = 0;
                for (int i = 3; i < 6; i++) {
                    for (int l = 6; l < 9; l++) {
                        list[tot] = sudoku[i][l];
                        tot++;
                    }
                }
            }
        } else {
            if (k < 3) {
                int tot = 0;
                for (int i = 6; i < 9; i++) {
                    for (int l = 0; l < 3; l++) {
                        list[tot] = sudoku[i][l];
                        tot++;
                    }
                }
            } else if (k < 6) {
                int tot = 0;
                for (int i = 6; i < 9; i++) {
                    for (int l = 3; l < 6; l++) {
                        list[tot] = sudoku[i][l];
                        tot++;
                    }
                }
            } else {
                int tot = 0;
                for (int i = 6; i < 9; i++) {
                    for (int l = 6; l < 9; l++) {
                        list[tot] = sudoku[i][l];
                        tot++;
                    }
                }
            }
        }
        ArrayList<Integer> al = new ArrayList<>();
        if (!contains(1, list)) {
            al.add(1);
        }
        if (!contains(2, list)) {
            al.add(2);
        }
        if (!contains(3, list)) {
            al.add(3);
        }
        if (!contains(4, list)) {
            al.add(4);
        }
        if (!contains(5, list)) {
            al.add(5);
        }
        if (!contains(6, list)) {
            al.add(6);
        }
        if (!contains(7, list)) {
            al.add(7);
        }
        if (!contains(8, list)) {
            al.add(8);
        }
        if (!contains(9, list)) {
            al.add(9);
        }
        int arr[] = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            arr[i] = al.get(i);
        }
        return arr;
    }

    boolean contains(int x, int arr[]) {
        boolean c = false;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                c = true;
            }
        }
        return c;
    }

    boolean complete() {
        boolean done = true;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (sudoku[i][j] == 0) {
                    done = false;
                }
            }
        }
        return done;
    }
}
