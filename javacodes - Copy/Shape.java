import java.util.Scanner;

class Circle extends Shape{
     double radius;
     
     public double calculate(double radius)
     {
        return 3.14*radius*radius;
     }
}

class Cylinder extends Circle{
    double height;

    public double calculate(double height,double radius)
    {
        double A=2*3.14*radius*height+2*3.14*radius*radius;
        return A;
    }
}

public class Shape {

    String name;

    public String getName() {
        return name;
    } 

    public static void main(String[] args)
    {
        double a,b;
        Scanner sc = new Scanner(System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();

        Circle Cir = new Circle();
        Cylinder Cyc = new Cylinder();

        System.out.println("Area of Circle : " + Cir.calculate(a) );
        System.out.println("Area of Cylinder : " + Cyc.calculate(b,a) );

    }
    
}
