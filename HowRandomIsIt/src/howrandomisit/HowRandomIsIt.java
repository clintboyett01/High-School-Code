/*gggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package howrandomisit;

/**
 *
 * @author Clint
 */
public class HowRandomIsIt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int q1=0,q2=0,q3=0,q4=0;
        
        
        for (int i = 0; i < 10; i++) {
            double r = Math.floor((Math.random()*100)+1);
            System.out.println(r);
            
            if (r>=75) {
                q1++;
            }
            if(75>=r&r>=50){
                q2++;
            }
            if (50>=r&r>=25) {
                q3++;
            }
            if (25>=r&r>=0) {
                q4++;
            }
                
        }
        
        System.out.println(q1);
        System.out.println(q2);
        System.out.println(q3);
        System.out.println(q4);
              
    }
    
}
