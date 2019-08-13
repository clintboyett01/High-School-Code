
package factors;

import java.util.*;
import java.io.*;

public class Factors  {

    public static long count=0;
    
    
    public static long fact(long x){
        
        if(x<=1){
            return 1;
            
        }
        else{
            return ((x)*fact((x-1)));
        }
        
    }
    public static void main(String[] args) throws IOException{
       Scanner sc = new Scanner(new File("factors.dat"));
       
       long c = sc.nextLong();
       sc.nextLine();
       
       for(long x = 0; x<c;x++){
           
            
            long f = sc.nextLong();
            sc.nextLine();
            f = fact(f);
            System.out.println(f);
            count = 0;
           
       }
       
    }
    
}
