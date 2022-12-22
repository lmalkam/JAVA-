import java.util.*;  
import java.io.*;
class M {
    public void method()throws IOException{
    throw new IOException("device error");
    }
    }

public class threeq6 {

    public void checker(int n) throws IOException
    {
        int store=n;
        int sum=0,mul=1;
        while(n!=0)
        {
            sum+=n%10;
            mul*=n%10;
            n/=10;
        }

        if(sum+mul==store)
        {
            System.out.println("IT is a magix number");
        }
        else
        {
            M m=new M();
            m.method();
        }
    }

    public static void main(String[] args) throws IOException{
        Scanner sc= new Scanner(System.in);    
        System.out.print("Enter first number- ");  
        int a= sc.nextInt();  

        threeq6 t=new threeq6();

         try
         {
            t.checker(a);
          
         }
         catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
