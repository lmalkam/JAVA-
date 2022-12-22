import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//*** instead of instantiating object from JFrame, extending this class
public class Mycal extends JFrame implements ActionListener {
    //*** here we hav two panels
    private JPanel panel, jPanel;
    private JButton jb1, jb2;
    private JTextField jt1, jt2, jt3;
    private  JLabel label1, label2, label3;
    
    //*** initializing Components
    public Mycal() {
        this.panel = new JPanel();
        this.jPanel = new JPanel();
        this.jb1 = new JButton("+");
        this.jb2 = new JButton("-");
        this.jt1 = new JTextField();
        this.jt2 = new JTextField();
        this.jt3 = new JTextField();
        this.label1 = new JLabel("First Number: ");
        this.label2 = new JLabel("Second Number: ");
        this.label3 = new JLabel("Result: ");
    }

    public void draw() {
        //*** using layout manager instead of placing every components in proper position by myself
        GridLayout gridLayout = new GridLayout(3, 2, 50, 30);
        panel.setLayout(gridLayout);
        //*** IMPORTANT: add components respectively
        panel.add(label1);
        panel.add(jt1);
        panel.add(label2);
        panel.add(jt2);
        panel.add(label3);
        panel.add(jt3);
        jt3.setEditable(false); //*** U can't change the value of this field

        GridLayout gLayout = new GridLayout(0, 2, 55, 0);
        jPanel.setLayout(gLayout);
        //*** when U implement the ActionListener(header of Ur class), U have to add ActionListener to Ur buttons like below commands
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jPanel.add(jb1);
        jPanel.add(jb2);
        
        //*** becase we extends JFrame, we can use add method directly or with this. to add components to the frame
        this.setTitle("Calcualtor"); //*** or use setTitle("Calcualtor"); and don't use this. operator
        //*** because we have two panels, we have to determine their positions in frame
        this.add(panel, "North");
        this.add(jPanel, "South");
        this.setSize(400,350);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //*** when we close the jframe window, the program will stop running
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int firstNum = Integer.parseInt(jt1.getText());
        int secondNum = Integer.parseInt(jt2.getText());
        int sum = 0;

        if (e.getSource() == jb1) //*** +
            sum = firstNum + secondNum;
        if (e.getSource() == jb2) //*** -
            sum = firstNum - secondNum;

        jt3.setText(String.valueOf(sum));
    }
}