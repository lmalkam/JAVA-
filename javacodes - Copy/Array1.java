import java.util.Scanner;

public class Array1 {
    public static void main(String[] args)
    {
        int[] arr;
        arr=new int[5];
        for(int i=0;i<5;i++)
        {
            int obj= new int(System.in);
            arr[i]=obj;
            System.out.println(arr[i]);
        }
    }
}
