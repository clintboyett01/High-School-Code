/*
 * This program is for practice on 
 * the 2012 District one uil test.
 * #1- Succsess #2- No Succsess
 */
package uild2.pkg2012;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Clint
 */
public class Uild22012 {

    
    public static void main(String[] args) throws IOException{
        
        Scanner sc = new Scanner(new File("bus.dat"));
        int count = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < count; i++) {
            String line = sc.nextLine().trim();
            String hhh[] = line.split("\\s+");
            
            int Fp = 999999;
            int onTheBus = Integer.parseInt(hhh[1]);
            int onTheBus2 = Integer.parseInt(hhh[1]);
            System.out.println(onTheBus);
            for (int j = 1; j < hhh.length; j+=2) {
                int temp = Integer.parseInt(hhh[j]);
                int temp2 = Integer.parseInt(hhh[j+1]);
                onTheBus+=temp;
                onTheBus+=temp2;
                if(onTheBus<Fp){
                    Fp= onTheBus;
                }
                System.out.println(onTheBus);
            }
            if(onTheBus<Fp){
                    Fp= onTheBus;
                }
            int j;
            ArrayList<Character> al = new ArrayList<>();
            for ( j = 1; j < hhh.length; j+=2) {
                //if its 1=A 3=B 5=C
                if(onTheBus2==Fp){
                    al.add((char)((j/2)+65));
                }
                int temp = Integer.parseInt(hhh[j]);
                int temp2 = Integer.parseInt(hhh[j+1]);
                onTheBus2+=temp;
                onTheBus2+=temp2;
            }
            if(onTheBus2==Fp){
                    
                al.add((char)((j/2)+65));
            }
            
            for(char el: al){
                System.out.print(el+" ");
            }
            System.out.println(Fp);
        }
    }
    
}
