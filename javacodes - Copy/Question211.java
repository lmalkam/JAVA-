class Parent{
    void print(){
        System.out.println("This is Parent Class");
    }
}

class Child extends Parent{
    void print()
    {
        System.out.println("This is Child class");
    }
}

public class Question211 {

    public static void main(String[] args) {

        Parent obj1=new Parent();
        obj1.print();

        Child obj2=new Child();
        obj2.print();

        Parent A;

        A=obj1;

        A.print();
    }
    
}
