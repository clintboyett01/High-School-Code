package dennis;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
/**
 * @Henderson Computer Science UIL team
 * Captain - Clint Boyett
 */
public class Dennis {

    
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("dennis.dat"));
        int count = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < count; i++) {
            int words = sc.nextInt(); sc.nextLine();
            String arr[] = new String[words];
            int longestWord = 0;
            for (int j = 0; j < words; j++) {
                arr[j]=sc.nextLine();
                if(arr[j].length()>longestWord){
                    longestWord = arr[j].length();
                }
            }
            for (int j = 0; j < words; j++) {
                boolean notLongEnough = true;
                while(notLongEnough){
                    if(arr[j].length()==longestWord){
                        notLongEnough=false;
                    }
                    else{
                        arr[j]+=" ";
                    }
                }
            }
            for (int j = 0; j < longestWord; j++) {
                for (int k = 0; k < words; k++) {
                    System.out.print(arr[k].charAt(j));
                }
                System.out.println("");
            }
            for (int j = 0; j < words; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
