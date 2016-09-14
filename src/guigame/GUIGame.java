/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guigame;
import component.*;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
/**
 *
 * @author anmol
 */
public class GUIGame implements KeyListener{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Screen screen = new Screen(600,350,Color.black);
        
        
        Football ball = new Football(new Point(100,100),"ball.png");
        
        
        screen.add(ball);
        
        Stage stage = new Stage(screen);
        stage.addKeyListener(new GUIGame());
        screen.play();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    
     System.out.println("Key Typed");
    }

    @Override
    public void keyPressed(KeyEvent e) {
    
    System.out.println(e.getKeyCode());
    
    }

    @Override
    public void keyReleased(KeyEvent e) {
     System.out.println("Key released");
    }
}
