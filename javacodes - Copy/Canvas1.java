;class Canvas extends JFrame{

    Canvas()
    {
        super("CANVAS");

        Canvas C= new Canvas()
        {

        void paint(Graphics g)
        {
            g.setColor(Color.RED);
            g.setColor(new FONT("BOLD",1,20));
            g.drawString("This is a String",100,100);

        }
    };
    C.setBackground(Color.black);
    add(C);
    setSize(400,300);
    show();
    }

}




public class Canvas1 {
    public static void main(String[] args) {

        Canvas c = new Canvas();
        
    }
    
}
