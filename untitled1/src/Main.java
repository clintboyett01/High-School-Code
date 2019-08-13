import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many?");
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            String str = "";
            switch ((int)(Math.random()*5)){
                case 0: str = "V";break;
                case 1: str = "M";break;
                case 2: str = "m";break;
                case 3: str = "amp";break;
                case 4: str = "v"; break;

            }
            System.out.print(" ");
            switch ((int)(Math.random()*6)){
                case 0: System.out.println(((int)(Math.random()*800))/100.0+str);break;
                case 1: System.out.println(str+" = "+((int)(Math.random()*800))/100.0);break;
                case 2: System.out.println(((int)(Math.random()*800))/100.0+" "+str);break;
                case 3: System.out.println(((int)(Math.random()*800))/100.0+"*10^"+((int)(Math.random()*10)-5)+str);break;
                case 4: System.out.println(str+" = "+((int)(Math.random()*800))/100.0+"*10^"+((int)(Math.random()*10)-5));break;
                case 5: System.out.println("ϴ = "+((int)(Math.random()*800))/100.0+"*10^"+((int)(Math.random()*10)-5)+"˚");break;
            }

        }
    }
}
