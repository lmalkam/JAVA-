import java.util.Scanner; 

public class leftright {

    public static void left(int[] a, int k,int n) {
        for (int i = 0; i < k; i++) {
            int temp = a[0];
            for (int j = 0; j < n-1; j++) {
                a[j] = a[j + 1];
            }
            a[n - 1] = temp;
        }
    }

    public static void right(int[] a, int k,int n) {
        for (int i = 0; i < k; i++) {
            int temp = a[n-1];
            for (int j = n-1; j > 0; j--) {
                a[j] = a[j - 1];
            }
            a[0] = temp;
        }
    }


    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        n = sc.nextInt();
        int[] array = new int[10];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int k;
        System.out.print("Enter the number of positions : ");
        k=sc.nextInt();

        int[] array2 = new int[10];
        for(int i=0;i<n;i++)
        {
            array2[i]=array[i];
        }

        left(array,k,n);
        right(array2,k,n);

        for(int i=0;i<n;i++)
        System.out.print(array[i] + " ");
        System.out.println();
        for(int i=0;i<n;i++)
        System.out.print(array2[i] + " ");

    }

}
