class Parent{
    void msg()
    {
        System.out.println("Parent Method");
    }
}

public class Q38 extends Parent{

    void msg() throws ArithmeticException
    {
        System.out.println("Child method");
    }
    
    public static void main(String[] args) {
        Parent P=new Q38();
        P.msg();
    }
}
