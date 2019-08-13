
package burpees;

import java.util.*;
import java.io.*;

public class Burpees {

    
    public static void main(String[] args) throws IOException {
        
        Scanner fl = new Scanner (new File("burpees.dat"));
        
        int peep = fl.nextInt();
        fl.nextLine();
        
        for(int x=1;x<=peep; x++ ){
            int total = 0;
            int days = fl.nextInt();
            fl.nextLine();
            for(int y=1; y<=days; y++){
                total+=y;
            }
                System.out.println(total);
            
        }
        
        
        
        
        
        
    }
    
}
