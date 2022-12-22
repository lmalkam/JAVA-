
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Canvas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lines
 */
public class Canvas extends Canvas{
    
    Canvas()
    {
        super("CANVAS");
        
        Canvas c;
        c = new Canvas(){
            
            @Override
            public void paint(Graphics g)
            {
                g.setColor(Color.red);
                g.setFont(new Font("BOLD",1,20));
                g.drawString("THIS IS MY CANVAS", 100, 100);
            }
            
        };
        
        c.setBackground(Color.black);
        
        add(c);
        setSize(400,300);
        show();
        
    }

    public static void main(String[] args)
    {
        Canvas c=new Canvas();
    }
    
}
