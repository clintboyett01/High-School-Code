
package life;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Life {


    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("life.dat"));
        
        int count = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < count; i++) {
            String dateStart;
            String dateEnd;
            String line = sc.nextLine();
            dateStart = line.substring(0, 5);
            dateEnd = line.substring(6);
            dateStart = dateStart.replaceAll(":", "");
            dateEnd = dateEnd.replaceAll(":", "");
            
            
            String clas = sc.nextLine().trim();
            String classTime[] = clas.split(" ");
            
            for (int j = 0; j < classTime.length; j++) {
                classTime[j] = classTime[j].replaceAll(":", "");
                }
            int ds = Integer.parseInt(dateStart);
            int de = Integer.parseInt(dateEnd);
            
            int [] ct = new int[classTime.length];
            for (int j = 0; j < classTime.length; j++) {
                ct[j] = Integer.parseInt(classTime[j]);
            }
                      
            for (int j = 0; j < classTime.length; j++) {
                if((ds<=ct[j]&ct[j]<=de)){
                    System.out.println("DAY #"+(i+1)+" CONFLICT WITH CLASS #"+(j/2+1));
                    j++;
                }
                       
            }
        }
    }
    
}
