
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lines
 */
public class Canvas1 extends Canvas{
    
    @Override
    public void paint(Graphics g)
    {
        g.setColor(Color.BLACK);
        g.drawLine(20,20,400,200);
        g.drawRect(20,5,200,300);
        g.drawOval(5,10,50,50);
    }
    
    public static void main(String[] args)
    {
        JFrame jf=new JFrame("CANVAS");
        Canvas1 c=new Canvas1();
        jf.setSize(600,400);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(c);
    }
    
}
