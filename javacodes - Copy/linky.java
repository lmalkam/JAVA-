import java.awt.*;
import java.awt.event.*;

public class linky
{
    linky()
    {

        Frame f=new Frame();
        Label label=new Label();
        label.setAlignment(Label.CENTER);
        label.setSize(400,100);

        Button b1=new Button("First");
        Button b2=new Button("Second");

        b1.setBounds(200,100,50,20);
        b2.setBounds(200,150,50,20);

        f.add(b1);
        f.add(b2);
        f.add(label);


        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(null);


        b1.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
                String Data = "It's been clicked "+ b1.getName();
                label.setText(Data);
            }

        });


    }

    public static void main(String[] args) {
        new linky();
    }
}