import java.awt.Label;

public class Checkboxx {


    Checkboxx()
    {
        Frame f=new Frame("Checkbox example");
        final Label label = new label();
        label.setAlignment(Label.CENTER);
        label.setSize(400,100);
        CheckboxGroup cb =new CheckboxGroup();
        Checkbox one = new Checkbox("C++",cb,false);
        one.setBounds(100,100,50,50);
        Checkbox two = new checkbox("JAVA",cb,false);
        two.setBounds(100,150,50,50);

        f.add(one);
        f.add(two);
        
    }

    public static void main(String[] args) {
        new Checkboxx();
    }
    
}
