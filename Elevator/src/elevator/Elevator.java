
package elevator;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Elevator {

    
    public static void main(String[] args) throws IOException{
       Scanner sc = new Scanner(new File("elevator.dat"));
       
       int c = sc.nextInt();
       sc.nextLine();
       
        for (int i = 0; i < c; i++) {
            
            String line = sc.nextLine();
            String [] sarr = line.split(" ");
            int arr [] = new int[sarr.length];
            for (int j = 0; j < sarr.length; j++) {
                arr[j] = Integer.parseInt(sarr[j]);
            }
            int peep=0;
            int tot = 0;
            for (int j = 0; j < sarr.length; j++) {
                tot += arr[j];
                if (tot<=2000) {
                    peep++;
                }
                else{
                    break;
                }
            }
            System.out.println(peep);
            
        }
    }
    
}
