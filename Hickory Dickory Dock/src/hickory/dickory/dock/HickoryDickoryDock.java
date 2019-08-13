
package hickory.dickory.dock;

import java.util.*;
import java.io.*;
public class HickoryDickoryDock {

    
    public static void main(String[] args) throws IOException{
        
        Scanner sc = new Scanner(new File("hickory.dat"));
        while(sc.hasNext()){
            System.out.println(sc.nextLine());
            if(sc.hasNext()){
                sc.nextLine();
            }
        }
        
        
        
    }
    
}
