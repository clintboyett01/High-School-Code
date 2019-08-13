package abdul;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @Henderson Computer Science UIL team
 */
public class Abdul {

    
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(new File("abdul.dat"));
        while(sc.hasNext()){
            int n = sc.nextInt();
            int collector = 0;
            for (int i = 0; i < 2*n; i++) {
                if (i%2==1) {
                    collector += i;
                }
            }
            System.out.println(collector);
        }
    }

}
