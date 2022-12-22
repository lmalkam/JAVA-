import java.util.Scanner;
public class Question6 {

    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        n = sc.nextInt();
        int[] array = new int[10];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int min1=999,min2=999;
        for(int i=0;i<n;i++)
        {
            if(array[i]<min1)
            min1=array[i];
        }

        for(int i=0;i<n;i++)
        {
            if(min2>min1 && min1!=array[i] && array[i]<min2)
            min2=array[i];
        }

        System.out.print(min2/min1);
    }
    
}
