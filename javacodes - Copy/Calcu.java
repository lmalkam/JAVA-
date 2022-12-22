import java.awt.*;
import java.awt.event.*;
import java.util.EventListener;

public class Calcu implements ActionListener{

    TextField t1,t2,t3;
    Button b1,b2;

    Calcu(){

        Frame f=new Frame();
        
        t1=new TextField();
        t2=new TextField();
        t3=new TextField();

        t1.setBounds(50,50,150,20);
        t2.setBounds(50,100,150,20);
        t3.setBounds(50,150,150,20);

        b1= new Button("+");
        b2= new Button(" - ");

        b1.setBounds(50,200,50,20);
        b2.setBounds(100,250,50,20);

        b1.addActionListener(this);


        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(b1);
        f.add(b2);

        f.setSize(500,500);
        f.setVisible(true);
        f.setLayout(null);

    }
        public void actionPerformed(ActionEvent e){
            String s1 =t1.getText();
            String s2=t2.getText();
            int a=Integer.parseInt(s1);
            int b=Integer.parseInt(s2);
            int c=0;
            if(e.getSource()==b1){
                c=a+b;
            }
            String result= String.valueOf(c);
            t3.setText(result);
        }

    

    public static void main(String[] args) {
        new Calcu();
    }
    
}
