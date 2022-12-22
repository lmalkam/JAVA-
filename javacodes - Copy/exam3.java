import java.util.*;

public class exam3 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of integers");
        int n=sc.nextInt();

        int[] a=new int[n];

        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            a[i]=x;
        }

        Vector<Vector<Integer>> vd = new Vector<Vector<Integer>>(10);

        Vector<Integer> v=new Vector<Integer>();

        for(int i=0;i<n;i++)
        {
            System.out.println(v);
            if(v.size()==0){
            v.add(a[i]);
            continue;
            }
            if(v.lastElement()+1==a[i])
            {
                v.add(a[i]);
            }
            else
            {
                vd.add(v);
                v.clear();
            }
        }

        // for(int k=0;k<vd.size();k++)
        // {
        //     for(int l=0;l<vd[k].size();l++)
        //     {
        //         System.out.println(vd[k][l]+ " ");
        //     }
        // }

        System.out.println(vd);

    }
    
}
