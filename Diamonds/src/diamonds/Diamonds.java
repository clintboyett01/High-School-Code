
package diamonds;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Diamonds {

    
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("diamonds.dat"));
        
        int count = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < count; i++) {
            String st = sc.nextLine();
            String arr [] = st.split(" ");
            char c = arr[0].charAt(0);
            int n = Integer.parseInt(arr[1]);
            
            for (int j = 0; j < n/2; j++) {
                System.out.print(" ");
            }
            System.out.println(c);
            for (int j = 0; j < n/2-1; j++) {
                for (int k = 0; k < n/2-1-j; k++) {
                    System.out.print(" ");
                }
                System.out.print(c);
                for (int k = 0; k < j*2+1; k++) {
                    System.out.print(" ");
                }
                System.out.println(c);
                
            }
            
            for (int j = 0; j < n/2; j++) {
                for (int k = 0; k < j; k++) {
                 System.out.print(" ");   
                }
                System.out.print(c);
                for (int k = 0; k < n-2-(j*2); k++) {
                    System.out.print(" ");
                }
                System.out.println(c);
            }
            for (int j = 0; j < n/2; j++) {
                System.out.print(" ");
            }
            System.out.println(c);
            
            
            
            
            
            System.out.println("");
        }
    }
    
}
