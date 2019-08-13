
package oop;

import java.util.Scanner;


class car{
    
    String color;
    int MaxSpeed;
    final int wheels = 4;
    double gasMilage;
    String carType;
    
   // carType(){
        
        
        
  //  }
    
    
    
}










public class Oop {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        car cc = new car();
        
        System.out.println("What color is your car?");
        cc.color = sc.nextLine();
        cc.gasMilage = (Math.random()+1)*20;
        System.out.println("What type of car do you own?"
                + "\n1. Corvette"
                + "\n2. Jaguar XJR"
                + "\n3. Audi S4");
                
    }
    
}
