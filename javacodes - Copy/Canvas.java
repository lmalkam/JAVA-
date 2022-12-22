import java.awt.Color;

import javax.swing.JFrame;

public class CanvasExample {

    CanvasExample()
    {
        JFrame f=new JFrame("Canvas");

        f.add(new MyCanvas());

        f.setSize(10,10,300,300);
        f.setVisible(true);
        f.setLayout(null);
    }

    public static void main(String[] args) {
        new CanvasExample();
    }
    
}

class MyCanvas extends Canvas{

    MyCanvas{
        setBackground(color.RED);
        setSize(300,300);
    }

    void paint(Graphics g)
    {
        g.setColor(Color.black);
        g.filloval(20,30,20,30);
    }

}
