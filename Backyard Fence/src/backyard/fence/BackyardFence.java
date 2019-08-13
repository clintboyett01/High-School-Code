
package backyard.fence;

import java.util.*;
import java.io.*;

public class BackyardFence {

    
    public static void main(String[] args) throws IOException {
        
        Scanner fl = new Scanner(new File("backyard.dat"));
        
        int fenceNum = fl.nextInt();
        fl.nextLine();
        
        for(int x= 1;x<=fenceNum; x++ ){
            
            int fenceLen = fl.nextInt();
            fl.nextLine();
            double b,p;
            b = fenceLen*2;
            b/=6;
            double pick= (1+(7.0/8));
            p = (fenceLen*12)/pick;
            int ext = 0;
            
            
            
            b =(int) Math.ceil(b);
            //p =(int) Math.ceil(p);
            p+=Math.ceil(fenceLen/10.0);
            //System.out.println(ext);
           
            System.out.println((int)b+" "+(int)p);
            
        }
        
        
        
        
    }
    
}
