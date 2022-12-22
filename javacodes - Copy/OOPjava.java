//import java.io.*;

class Thread1 extends Thread
{
    public void run()
    {
        try
        {
        for(int i=0;i<100000;i++)
        System.out.println("OOPS STRING");
        }
        catch(Exception e)
        {
            System.out.println("Exeception caught");
        }
    }
}

class Thread2 extends Thread
{
    public void run()
    {
        try
        {
            for(int i=0;i<100000;i++)
        System.out.println("JAVA STRING");
        }
        catch(Exception e)
        {
            System.out.println("Exeception caught");
        }
    }
}

public class OOPjava {
    public static void main(String[] args) {
        Thread1 A=new Thread1();
        Thread2 B=new Thread2();
        A.start();
        try
        {
            A.join(2000);
        }
        catch(Exception e){
            System.out.println("YESSS");
        }

        B.start();

        try
        {
            B.join(2000);
        }
        catch(Exception e){
            System.out.println("NOOO");
        }
    }
    
}
