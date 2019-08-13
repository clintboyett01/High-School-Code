
package beautiful.java;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class BeautifulJava {

    
    public static void main(String[] args)throws IOException {
        
        Scanner sc = new Scanner(new File("beautiful.dat"));
        
        int c= sc.nextInt();
        sc.nextLine();
        double  tot = 0;
        for (int i = 0; i < c; i++) {
            
            String line = sc.nextLine();
            
            line = line.substring(line.length()-5,line.length());
            double  n = Double.parseDouble(line);
            tot+=n;
            
            
            
            
            
        }
        
        System.out.println("$"+tot);
    }
    
}
