/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Clint
 */
public class DataStructures {

    public static void sort(double a[]) {
        boolean loopSomeMore;

        do {
            loopSomeMore = false;

                 
      
        for (int j = 0; j < a.length - 1; j++) {
            if (a[j] > a[j + 1]) {
                double temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;
                loopSomeMore = true;
            }
        }
    }
    while(loopSomeMore

);   
} 
    
    public static void main(String[] args)throws IOException {
        
        Scanner sc = new Scanner( new File("LongDB"));
        
        
        

            Object[][] obj;
            
            ArrayList<String> al = new ArrayList<>();
            
            
            
            while(sc.hasNext()){
                
                String s = sc.nextLine();
                al.add(s);
                
            }
            
            obj = new Object[2][al.size()];
            
            double dar []= new double[al.size()];
            for(int i = 0; i < al.size(); i++) {
            
               String s = al.get(i);
               
               obj[1][i] = s;
               
               double d = Double.parseDouble(s);
               
               obj[0][i] = d;
               dar[i] = d;
               
        }
            sort(dar);
            for (int i = 0; i < al.size(); i++) {
            
                
                for (int j = 0; j < al.size(); j++) {
                    if(dar[i] ==(double)obj[0][j]){
                        System.out.println(obj[1][j]);
                    }
                }
        }
            
            
            
            

    }
    
}
