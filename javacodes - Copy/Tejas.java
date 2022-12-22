import java.util.Scanner;
public class Tejas {
    static int part(int A[], int low, int high)
    {
        int P=A[low];
        int l=low+1;
        int h=high;

        while(l<=h){
            while(A[l]<=P){
                l++;
            }
            while(A[h]>P){
                h--;
            }
            if(l<h){
                int temp=A[l];
                A[l]=A[h];
                A[h]=temp;
            }
        }
        int temp=A[low];
        A[low]=A[h];
        A[h]=temp;
        return h;
    }
    static void quicksort(int A[], int low, int high)
    {
        if(low<high){
            int k=part(A,low,high);
            quicksort(A,low,k-1);
            quicksort(A,k+1,high);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int A1[]=new int[n];
        int A2[]=new int[m];
        int A3[]=new int[m+n];
        int i=0,k=0;
        while(n!=i){
                A1[i]=sc.nextInt();
                i++;
        }
        while(m!=k){
            A2[k]=sc.nextInt();
            k++;
        }
        int low1=0,high1=i-1;
        int low2=0,high2=k-1;
        quicksort(A1,low1,high1);
        quicksort(A2,low2,high2);
        int a=0,b=0;
        for(int j=0;j<i+k-1;j++){
            if(A1[a]<A2[b]){
                A3[j]=A1[a];a++;
            }
            else{
                A3[j]=A2[b];b++;
            }
        }
        if(a<i){
            A3[i+k-1]=A1[i-1];
        }
        else{
            A3[i+k-1]=A2[k-1];
        }
        for(int j=0;j<i+k;j++){
            System.out.println(A3[j] + " ");
        }
    }
}
