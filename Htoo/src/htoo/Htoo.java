package htoo;

import java.awt.geom.Line2D;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @Henderson Computer Science UIL team
 * comp
 */
public class Htoo {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("htoo.dat"));
        int count = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < count; i++) {

            String line1 = sc.nextLine().trim();
            String line2 = sc.nextLine().trim();
            int l1x1 = Integer.parseInt("" + line1.charAt(1));
            int l1y1 = Integer.parseInt("" + line1.charAt(4));
            int l1x2 = Integer.parseInt("" + line1.charAt(10));
            int l1y2 = Integer.parseInt("" + line1.charAt(13));
            int l2x1 = Integer.parseInt("" + line2.charAt(1));
            int l2y1 = Integer.parseInt("" + line2.charAt(4));
            int l2x2 = Integer.parseInt("" + line2.charAt(10));
            int l2y2 = Integer.parseInt("" + line2.charAt(13));

            Line2D firstLine = new Line2D.Float(l1x1,l1y1,l1x2,l1y2);
            Line2D secondLine = new Line2D.Float(l2x1,l2y1,l2x2,l2y2);
            boolean intersects = secondLine.intersectsLine(firstLine);
            if(intersects){
                System.out.println("INTERSECT");
            }
            else{
                System.out.println("NO INTERSECTION");
            }
        }
    }

}
