import java.awt.*;
import java.awt.Canvas;
// class to construct a frame and containing main method 
public class Canva
{
    // class constructor
    public Canva()
    {
// creating a frame 
        Frame f = new Frame("Canvas Example");
// adding canvas to frame 
        f.add(new MyCanvas());
// setting layout, size and visibility of frame 
        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        Canva c = new Canva();
    }

    private void setSize() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
// class which inherits the Canvas class 
// to create Canvas 
class MyCanvas extends Canvas
{
    // class constructor
    public MyCanvas(){
        setBackground (Color.GRAY);
        setSize(300, 200);
    }
    // paint() method to draw inside the canvas
    public void paint(Graphics g)
    {
// adding specifications 
        g.setColor(Color.red);
        g.fillOval(75, 75, 150, 75);
    }
}