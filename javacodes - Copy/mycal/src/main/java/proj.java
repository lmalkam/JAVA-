
import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lines
 */

class Canva extends Canvas{
    
    int width=1024;
    int height = width/16 *9;
    
    public void start()
    {
        Dimension size= new Dimension(width,height);
        setPreferredSize(size);
        paint(null);

    }
    
    public void paint(Graphics g)
    {
        g.setColor(Color.GREEN);
        g.fillRect(0,0,width,height);
    }
    
    
    Canva()
    {
        
        
        
        
        
    }
}

class frame extends JFrame{
    
    frame()
    {
        
        setSize(300,300);
        setVisible(true);
    }
    
}
public class proj {
    
    public static void main(String[] args)
    {
        Canva c=new Canva();
        frame f=new frame();
        f.add(c);
    }
    
}
