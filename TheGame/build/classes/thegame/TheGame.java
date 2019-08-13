/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thegame;

import java.awt.*;  
import javax.swing.JFrame; 

/**
 *
 * @author Clint
 */
public class TheGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DisplayGraphics m=new DisplayGraphics();  
        JFrame f=new JFrame();  
        f.add(m);  
        f.setSize(800,800);  
        //f.setLayout(null);  
        f.setVisible(true);
        
    }
    
}


class DisplayGraphics extends Canvas{  
      
    public void paint(Graphics g) {  
        g.drawString("Hello",40,40);  
        setBackground(Color.WHITE);  
        g.fillRect(130, 30,100, 80);  
        g.drawOval(30,130,50, 60);  
        setForeground(Color.RED);  
        g.fillOval(130,130,50, 60);  
        g.drawArc(30, 200, 40,50,90,60);  
        g.fillArc(30, 130, 40,50,180,40);  
          
    }  
  
}  