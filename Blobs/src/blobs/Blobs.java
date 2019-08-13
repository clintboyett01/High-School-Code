
package blobs;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Blobs {
    
    
    
    
    public static void main(String[] args)throws IOException{
        
        Scanner sc = new Scanner(new File("blobs.dat"));
        
        int count = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < count; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            int s = sc.nextInt();
            sc.nextLine();
            
            char max [][]= new char[r][c];
            try{
            for (int j = 0; j < r; j++) {
                String st = sc.nextLine();
                for (int k = 0; k < c; k++) {
                    max[j][k]=st.charAt(k);
                }
            }
            }
            catch(Exception e){
            }
            
            
            for (int n = 0; n < s; n++) {
                
            
            int j = sc.nextInt();
            int k = sc.nextInt();
            
            if(max[j-1][k-1]=='*'){
                
                
                
                
                
                int topx = j-1;               
                try{

                for(int p=0;p<r;p++){
                if(max[j-2-p][k-1]=='*'){
                    topx= j-2-p;
                    
                }
                else{
                    break;
                }
                }
                }
                catch(Exception e){
                }
                
                int botx = j-1;                
                try{

                for (int l = 0; l < r; l++) {
                    if(max[j+l][k-1]=='*'){
                        botx = j+l;
                    }
                    else{
                        break;
                    }
                }
                }
                catch(Exception e){
                }

                
                int lefty = k-1;                
                try{

                for (int l = 0; l < c; l++) {
                    if(max[j-1][k-2-l]=='*'){
                        lefty = k-2-l;
                    }
                    else{
                        break;
                    }
                }
                }
                catch(Exception e){
                }
                
                
                
                int righty = k-1;
                try{
                    for (int l = 0; l < c; l++) {
                        if(max[j-1][k+l]=='*'){
                            righty = k+l;
                        }
                        else{
                            break;
                        }
                    }
                }
                catch(Exception e){
                    
                }
                
                int le = lefty++;
                int to = topx++;
                System.out.println(topx+" "+lefty);
                
            }
            else{
                System.out.println("NO BLOB");
            }
            }
            }
        
    }
    
}
