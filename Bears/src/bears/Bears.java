
package bears;

import java.util.*;
import java.io.*;
public class Bears {

    
    
    
    
    public static void main(String[] args) throws IOException {
        
        
        
        Scanner b = new Scanner(new File("bears.dat"));
        
        
        int mapNumm = b.nextInt();
       b.nextLine();
        
        for(int x=0; x<mapNumm; ++x){
            int bears = 0;
            for(int y=1; y<=10; ++y){
             
                String line = b.nextLine();
                
                for(int z=1; z<=10; ++z){
                
                if (line.charAt(z-1)== 'B'){
                   
                ++bears;            
            
                }
                    
                
              
                
                
                
            }
                  
                
            }
            System.out.println(bears);

            
        }
        
        
        
        
        
        
        
    }
    
}
