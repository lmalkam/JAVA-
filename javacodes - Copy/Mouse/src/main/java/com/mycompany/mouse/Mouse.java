/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mouse;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author lines
 */
public class Mouse extends JFrame implements MouseListner{
    
    JFrame f;
    JLabel l;
    
    Mouse(){  
          
        l=new JLabel("Mouse");  
        l.setBounds(20,50,100,20);  
        add(l); 
        addMouseListener((MouseListener) this);
    }  
    public void mouseClicked(MouseEvent e) {  
        l.setText("Mouse Clicked");  
    }  
    public void mouseEntered(MouseEvent e) {  
        l.setText("Mouse Entered");  
    }  
    public void mouseExited(MouseEvent e) {  
        l.setText("Mouse Exited");  
    }  
    public void mousePressed(MouseEvent e) {  
        l.setText("Mouse Pressed");  
    }  
    public void mouseReleased(MouseEvent e) {  
        l.setText("Mouse Released");  
    }  

    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        mouse.setBounds(10,10,1000,1000);
        mouse.setLayout(null);
        mouse.setVisible(true);
    }

}
