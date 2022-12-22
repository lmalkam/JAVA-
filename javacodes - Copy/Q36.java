import java.util.Scanner;
class UserDefinedException extends Exception
{
    public UserDefinedException(String str)
    {
     super(str);
    }
}

public class Q36 {

    public static boolean checker(int n)
    {
        int store=n;
        int sum=0,mul=1;
        while(n!=0)
        {
            sum+=n%10;
            mul*=n%10;
            n/=10;
        }

        if(sum!=mul)
        {
            return false;
        }

        return true;

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);    
        System.out.print("Enter first number- ");  
        int a= sc.nextInt();  

        try
        {
            if(checker(a))
            throw new UserDefinedException("NOt a number");
        }
        catch(UserDefinedException ude)
        {
            System.out.println("caught");
        }
    }
    
}
