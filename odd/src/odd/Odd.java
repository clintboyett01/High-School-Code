
package odd;

import java.util.*;
import java.io.*;

public class Odd {

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("odd.dat"));
        
        int set = sc.nextInt();
        sc.nextLine();
        
        for(int x=1; set>=x;x++){
            ArrayList al = new ArrayList();
            String ln = sc.nextLine();
            for(int o = 0; o<(ln.length());){
               // System.out.println(ln.charAt(o));
                al.add(ln.charAt(o));o++;
            }
            Collections.sort(al);
            for(int o = 0; o<ln.length();){
              System.out.print(al.get(o));
            o++;
            }
            System.out.println();
        }
            
        
        
        
    }
    
}
