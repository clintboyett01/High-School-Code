
package elivator;

import java.util.*;
import java.io.*;

public class Elivator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       
        Scanner sc = new Scanner (new File("elevator.dat"));
        
        int t = sc.nextInt();
       sc.nextLine();
       
       for(int l = 0; l<t; l++){
           int tot = 0,peep = 0;
           
           ArrayList<Integer> arr = new ArrayList<Integer>();
           
           String line = sc.nextLine();
           String [] sarr = line.split(" ");
           for(String el : sarr){
               int y = Integer.parseInt(el);
               
               arr.add(y);
           }
           
           for(int x=0;x<arr.size();x++)
               if(tot<=2000){
                   if(tot + arr.get(x)<=2000){
                        tot += arr.get(x);
                        peep++;
                   }
                   else{
                        break;
                   }
               
               }
               else{
                   break;
               }
           
           
           
           
           
          /* while(tot<2000){
               tot += sc.nextInt();
               peep++;
           }
          */
           
           
           System.out.println(peep);
       }
        
        
    }
    
}
