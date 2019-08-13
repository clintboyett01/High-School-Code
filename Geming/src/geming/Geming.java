package geming;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @Henderson Computer Science UIL team
 */
public class Geming {

    
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("geming.dat"));
        while(sc.hasNext()){
            int num = sc.nextInt();
            sc.nextLine();
            System.out.println(num + " " + (~num));
        }
    }

}
