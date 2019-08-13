package hickory;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Hickory {
public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("hickory.dat"));
        while(sc.hasNext()){
            System.out.println(sc.nextLine());
            if(sc.hasNext())
            sc.nextLine();
        }
    }
}
