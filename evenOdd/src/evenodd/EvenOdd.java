/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evenodd;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Clint
 */
public class EvenOdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        
        String [] st = {"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra", "Herman"};
        Arrays.sort(st);
        
        String [] rst= new String[st.length];
        for (int i = 0; i < st.length; i++) {
            rst[i]=st[st.length-1-i];
        }
        System.out.println("Ascend\t  Descend");
        System.out.println("");
        for (int i = 0; i < st.length; i++) {
            System.out.print(st[i]);
            for (int j = 0; j < 10-st[i].length(); j++) {
                System.out.print(" ");
            }
            System.out.println(rst[i]);
            for (int j = 0; j < 10; j++) {
                System.out.println(j+1);
            }
        }
    }  
}