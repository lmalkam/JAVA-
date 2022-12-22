import java.awt.Color;

import javax.swing.JFrame;

public class CanvasExampl {

   public  CanvasExampl()
    {
        Frame f=new Frame("Canvas");

        f.add(new MyCanvas());

        f.setSize(300,300);
        f.setVisible(true);
        f.setLayout(null);
    }

    public static void main(String[] args) {
        new CanvasExampl();
    }
    
}

class MyCanvas extends Canvas{

    public MyCanvas(){
        setBackground(color.RED);
        setSize(200,200);
    }

    public void paint(Graphics g)
    {
        g.setColor(Color.black);
        g.filloval(20,30,20,30);
    }

}
