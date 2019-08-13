
package beutiful;

import java.util.*;
import java.io.*;

public class Beutiful {

    
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(new File("beutiful.dat"));
        
        int loop = sc.nextInt();
        sc.nextLine();
        
        double tot = 0.0;
        String line = "";
        String line2;
        for(int x=1;x<=loop;x++){
        
        line = sc.nextLine();
        double gmon;
        line2 = line.substring(line.length()-5);
        gmon = Double.parseDouble(line2);
        tot+=gmon;
        

        }System.out.println(tot);
    }
    
}
