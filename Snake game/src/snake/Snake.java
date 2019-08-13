
package snake;

import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import java.awt.Graphics;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class Snake implements ActionListener, KeyListener
{
    public static Snake Snake;
    
    public final int WIDTH = 1020, HEIGHT = 1020;
    
    public Renderer renderer;
    
    public int ticks, yMotion, score;
    
    public Rectangle snake;
    
    public ArrayList<Rectangle> walls ;
    
    public int speed = 10;
    
    public Random rand;
    
    public boolean gameOver, started, changeDir;
    
    public Snake()
    {
        JFrame jframe = new JFrame();
        Timer timer = new Timer(20, this);
        
        renderer = new Renderer();
        rand = new Random();
        
        jframe.add(renderer);
        jframe.setSize(WIDTH, HEIGHT);
        jframe.setVisible(true);
        jframe.setTitle("The Snake Game!");
        jframe.addKeyListener(this);
        jframe.setResizable(false);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        snake = new Rectangle(WIDTH / 2 - 10, HEIGHT / 2 - 10, 20, 20);
        
        

        
        timer.start();
    }

    
    public void moveUp(){
        
    }
    
    public void moveDown(){
        
    }
    
    public void moveLeft(){
        for(;;){
            
            if(changeDir){
                changeDir=false;
                break;
            }
        snake.y += yMotion;
        }
    }
     
    public void moveRight(){
        
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
        
        ticks++;
        
        if (started)
                {
        
        
        
        
        for (Rectangle wall : walls)
        {
            
            if (wall.intersects(snake))
               
            {
                gameOver = true;
                
              /*  if (snake.x <= wall.x)
                {
                 
                 snake.x = wall.x - snake.width;
                 
                 
                }
                */
                
            }
            if (snake.intersects(snake))
               
            {
                gameOver = true;
                
              /*  if (snake.x <= wall.x)
                {
                 
                 snake.x = wall.x - snake.width;
                 
                 
                }
                */
                
            }
        }
        
        
        
        
        
        
        
                }    
        renderer.repaint();
    }
    
    public void repaint(Graphics g)
    {
        g.setColor(Color.GRAY.darker().darker());
        g.fillRect(0, 0, WIDTH, HEIGHT);
        
        
        
              
        
        g.setColor(Color.red);
        g.fillRect(snake.x, snake.y, snake.height, snake.height);
        
        
        g.setColor(Color.white);
        g.setFont(new Font("Arial", 1, 100));
        
        
        g.setColor(Color.black);
        g.fillRect(0, 0, WIDTH-1000, HEIGHT);
        g.setColor(Color.black);
        g.fillRect(0, 0, WIDTH, HEIGHT-1000);
        g.setColor(Color.black);
        g.fillRect(WIDTH-30, 0,WIDTH,HEIGHT);
        //g.setColor(Color.black);
        //g.fillRect(0, HEIGHT, WIDTH, HEIGHT-1000);
        g.setColor(Color.black);
        g.fillRect(0, HEIGHT-60, WIDTH, HEIGHT);
        
        
        if (!started)
        {
            g.drawString("Click to play!", WIDTH/2-310, HEIGHT / 2 - 100);
        }
         if (gameOver)
        {
            g.drawString("Game Over!", WIDTH/2-310, HEIGHT / 2 );
        }
         if (!gameOver && started)
         {
             g.drawString(String.valueOf(score), 575, 100);
         }
        
    }
    public static void main(String[] args) 
    {
       Snake = new Snake();
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
    int keyCode = e.getKeyCode();
    switch( keyCode ) { 
        case KeyEvent.VK_UP:
            changeDir = true; 
            moveUp();
            // handle up 
            break;
        case KeyEvent.VK_DOWN:
            changeDir = true;    
            moveDown();
            // handle down 
            break;
        case KeyEvent.VK_LEFT:
            changeDir = true;   
            moveLeft();
            // handle left
            break;
        case KeyEvent.VK_RIGHT :
            changeDir = true;
            moveRight();
            // handle right
            break;
     }
} 

    @Override
    public void keyReleased(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
    
}


class Renderer extends JPanel 
{
    private static final long serialVersionUID = 1L;
    
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        Snake.Snake.repaint(g);
        
    }
}
