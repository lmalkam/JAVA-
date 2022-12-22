import java.util.Scanner;

class CustomException extends Exception{
        CustomException()
        {
            super("CUSTOM");
        }
    }

public class Array {
    
    
    public static void main(String[] args) {

        int[] arr=new int[100];

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int i=0,size=0;

        while(n!=-1)
        {
            arr[i++]=n;
            n=sc.nextInt();
            size++;
        }

        for(i=0;i<size;i++)
        {
            System.out.print(arr[i]);
        }

        int c=0,sum=0;

        while(c<size)
        {
            int t=arr[c];
            while(arr[c+1]==arr[c]+1)
            {
                sum+=arr[c];
              //  System.out.println(arr[]);
                c++;
            }

            c++;
        }

        if(arr[c]==arr[c-1]+1)
        sum+=arr[c];


        System.out.println();

        System.out.println(sum);

        try{
            if(sum>10)
            throw new CustomException();
        }
        catch(CustomException e)
        {
            System.out.println(e);
        }
        
    }

    
    
}
