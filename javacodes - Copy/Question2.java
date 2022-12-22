import java.util.Scanner;

public class Question2 {

    static int part(int A[], int low, int high) {
        int P = A[low];
        int l = low + 1;
        int h = high;

        while (l <= h) {
            while (A[l] <= P) {
                l++;
            }
            while (A[h] > P) {
                h--;
            }
            if (l < h) {
                int temp = A[l];
                A[l] = A[h];
                A[h] = temp;
            }
        }
        int temp = A[low];
        A[low] = A[h];
        A[h] = temp;
        return h;
    }

    static void quicksort(int A[], int low, int high) {
        if (low < high) {
            int k = part(A, low, high);
            quicksort(A, low, k - 1);
            quicksort(A, k + 1, high);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];

        for (int i = 0; i < 5; i++) {
            array[i] = sc.nextInt();
        }

        int[] array2 = new int[5];

        for (int i = 0; i < 5; i++) {
            array2[i] = sc.nextInt();
        }

        // for(int i=0;i<5;i++) {
        // System.out.print(array2[i]+ " ");
        // }

        quicksort(array,0,4);
        quicksort(array2,0,4);

         for(int i=0;i<5;i++) {
         System.out.print(array2[i]+ " ");
         }



    }

    
}
