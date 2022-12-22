abstract class Shaper{
    Shaper(){
        System.out.println("Shape constructor called");
    }
    public String color;
    abstract double area();
    abstract String tooString();
    abstract String getcolor();
}

class circle extends Shaper{
    double radius;
    circle(double radius,String color){
        System.out.println("Circle constructor called");
        this.radius=radius;
        this.color=color;
    }
    public double area(){
        return 3.14*radius*radius;
    }
    public String tooString(){
        return "Circle color is " +getcolor()+ " and " +  " area is : " + area();
    }
    public String getcolor(){
        return color;
    }
}

class rectangle extends Shaper{
    double length,width;

    rectangle(double length,double width,String color){
        System.out.println("Rectangle constructor called");
        this.length=length;
        this.width=width;
        this.color=color;
    }
    public double area(){
        return length*width;
    }
    public String tooString(){
        return "Rectangle color is " +getcolor()+ " and " +  "area is : " + area();
    }
    public String getcolor(){
        return color;
    }
}

class Shape1{
    public static void main(String[] args){
        circle c=new circle(2.2,"Red");
        rectangle r=new rectangle(4,2,"Yellow");
        System.out.println(c.tooString());
        System.out.println(r.tooString());
    }
}