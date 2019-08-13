
package shake;
import java.util.*;
import java.io.*;
public class Shake {

    
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(new File("shake.dat"));
        int count = sc.nextInt();
        sc.nextLine();
        for(int c=0;c<count;c++){
            String line = sc.nextLine();
            double dsize = line.length();
            dsize = Math.ceil(dsize);
            dsize = Math.sqrt(dsize);
            int size = (int)(dsize);
            char [] arr = line.toCharArray();
            char [][] matrix= new char[size][size] ;
            int counter = 0;
            for(int x=1;x<=size;x++){
                for(int y=1;y<=size;y++){
                    matrix[x-1][y-1] = arr[counter];
                    counter++;
                      
                }
            //TODO add *ABCDEF....    
            }
            int odd=0;
            for(int x=0;x<size;x++){
                char holdLong = ' ';
                for(int y=0; y<size; y++){
                if(odd%2==1){
                    char hold = matrix[x][y];
                    int k =(y+1<size-1)?y+1:0;
                    if(k==0){
                    holdLong = matrix[x][(y+1<size-1)?y+1:0];
                }
                    else if (k==size-1){
                    matrix[x][(y+1<size-1)?y+1:0]=holdLong;
                    continue;
                }
                    matrix[x][(y+1<size-1)?y+1:0]=hold;
                    //System.out.print(y+".....");
                    
                }
                else{
                                       
                    char hold = matrix[x][y];
                    int k =(y-1>=0)?y-1:size-1;
                    if(k==size-1){
                    holdLong = matrix[x][(y-1>=0)?y-1:size-1];
                }
                    else if (k==0){
                    matrix[x][0]=holdLong;
                }
                    matrix[x][(y-1>=0)?y-1:size-1]=hold;
                    // System.out.print(y+".....");
                }
                }
               odd++;
            }
            
            for(int x=0;x<size;x++){
                for(int y=0;y<size;y++){
                    arr[x*y]=matrix[x][y];
                    
                }
                
            }
            for(int x=0;x<size;x++){
                for(int y=0;y<size;y++){
                    System.out.print(matrix[x][y]);
                }
                
            }
            //for(int x = 0; x<arr.length-3;x++){
              //  System.out.print(arr[x]);
            //}
            System.out.println();
            
            
            
            
        }
        
        
    }
    
}
