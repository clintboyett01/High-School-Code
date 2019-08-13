
package rotatematrix;

import java.util.Scanner;

/**
 *
 * @author Clint
 */
public class RotateMatrix {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 9 diggets for the matrix(seperated by spaces)");
        String line = sc.nextLine().trim();
        String a [] = line.split(" ");
        String matrix [][]= {{a[0],a[1],a[2]},
                             {a[3],a[4],a[5]},
                             {a[6],a[7],a[8]}};
        String rotatedMatrix [][] = {{a[6],a[3],a[0]},
                                    {a[7],a[4],a[1]},
                                    {a[8],a[5],a[2]}};
        System.out.print("{");
        for(String[] v:matrix){
            System.out.print("{");
            for(String el: v){
                System.out.print(el+",");
            }
            System.out.println("\b}");
        }
        System.out.println("\b},");
        System.out.println("\n\n");
        System.out.print("{");
        for(String[] v:rotatedMatrix){
            System.out.print("{");
            for(String el: v){
                System.out.print(el+",");
            }
            System.out.println("\b},");
        }
        System.out.println("\b}");
        
        System.out.println(matrix.toString());
    }
    
}
