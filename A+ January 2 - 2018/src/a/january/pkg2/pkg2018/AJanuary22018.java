package a.january.pkg2.pkg2018;

import java.io.File;
import java.io.IOException;
import java.util.*;


public class AJanuary22018 {
    
    public static void main(String[] args) throws IOException {
        
      /*  
        int 
                x = 6;
        
        if(x%2==0)
 out.print(x*5+" ");
else
if(x%3==0)
 out.print(x/5+" ");
else
 out.print(x+" ");
        
        
        */
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*
        Scanner sc = new Scanner(new File("mod5.dat"));
        int t = sc.nextInt();
                sc.nextLine();
        for (int i = 0; i < t ; i++) {
            int s = sc.nextInt();
            sc.nextLine();
            int arr [] = new int[s];
            for (int j = 0; j < s; j++) {
                arr[j]=sc.nextInt();
            }
            sc.nextLine();
            ArrayList<Integer> al5 = new ArrayList<>();
            ArrayList<Integer> al = new ArrayList<>();
            for (int j = 0; j < s; j++) {
                
                if (arr[j]%5==0) {
                    al5.add(arr[j]);
                    
                } else {
                    al.add(arr[j]);
                }
            }
            Collections.sort(al);
            Collections.sort(al5);
            for(int el: al){
                System.out.print(el+" ");
            }
            for(int el: al5){
                System.out.print(el+" ");
            }
            System.out.println("");
        }
        
        
        
        */
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /* Scanner sc = new Scanner (new File("mirror.dat"));
        
        
        int y = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < 7; j++) {
                String ln = sc.nextLine();
                System.out.println(ln+"|"+ln);
            }
            System.out.println("***");
        }
        
        
        
        */
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    //fail
/*    
    Scanner sc = new Scanner(new File("components.dat"));
    obj o = new obj();
    int t = sc.nextInt();
    sc.nextLine();
        for (int i = 0; i < t; i++) {
            
            String line = sc.nextLine();
            Scanner ln = new Scanner(line);
            String obj = ln.next();
            ln.next();
            while(ln.hasNext()){
                o.addMat(ln.next());
            }
            o.setObjName(obj);
            
            
            
            
            
            
        }
        
    */
        
        
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*{
        Scanner sc = new Scanner(new File("lethologica.dat"));
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String ln = sc.nextLine();
            String ln2 = sc.nextLine();
            String k = ln.replace( "*" , ln2);
           
            System.out.println(k);
        }

        */
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*{
        Scanner sc = new Scanner(new File("cognates.dat"));
                int t = sc.nextInt();
                sc.nextLine();
               
            for (int i = 0; i < t; i++) {
                int cog = 0;
                String word = sc.nextLine();
                String word2 = sc.nextLine();
                String Lng;
                String Srt;
                
                if (word.length() > word2.length()) {
                    Lng = word;
                    Srt = word2;
                } else {
                    Lng = word2;
                    Srt = word;
                    Lng.toUpperCase();
                    Srt.toUpperCase();
                    
                    
                }
                char larr []= Lng.toCharArray();
                char sarr []= Srt.toCharArray();
                for (int j = 0; j < Srt.length(); j++) {
                    for (int k = 0; k < Lng.length(); k++) {
                        if (sarr[j]==larr[k]) {
                            cog++;
                            
                            
                            larr[k] = 'v';
                            break;
                        }
                    }
                }
                System.out.println(cog);
            }888888888888*/
 {Scanner sc = new Scanner(new File("sines.dat"));
        
        int t = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < t; i++) {
            
            double  A = sc.nextDouble();
            double  a = sc.nextDouble();
            double  b = sc.nextDouble();
            a = Math.toRadians(a);
            b = Math.toRadians(b);
            
            
            double  B;
            a = Math.sin(a);
            b = Math.sin(b);
            
            
            B = A*b;
            B /= a;
            B *= 10;
            B = Math.round(B);
            B/= 10;
            System.out.println(B);
            
        }
        
        
        }
 /*{
            //prob 1
            Scanner sc = new Scanner(new File("steganography.dat"));
            
            int t = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < t; i++) {
                String line = sc.nextLine();
                for (int j = 0; j < line.length(); j++) {
                    if(j%2==0){
                        System.out.print(line.charAt(j));
                    }
                }
                System.out.println("");
            }*/
    }
}

class obj{

    
    private String objName;
    private ArrayList<String> mat = new ArrayList<>();
    
    String getObjName(){
        return objName;
    }
    void setObjName(String n){
        
        objName=n;
    }
    void addMat(String m){
        
        mat.add(m);
    }
    void printMat(){
        System.out.println(mat);
    }

}