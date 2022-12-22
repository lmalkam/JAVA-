import java.util.Scanner;

public class BinT {

    Node head;

    static class Node{

        int data;
        Node lc;
        Node rc;

        Node(int data)
        {
            this.data=data;
            this.lc=null;
            this.rc=null;
        }

    }


        public static Node CreateBT(BinT T)
        {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            if(n==0)
            return null;
            T.head=new Node(n);
            T.head.lc=CreateBT(T);
            T.head.rc=CreateBT(T);
            return T.head;
        }

        public static void preorder(BinT T)
        {
            Node sample=T.head;
            pre(sample);
        }

        public static void pre(Node T)
        {
            if(T!=null)
            {
                System.out.println(T.data);
                pre(T.lc);
                pre(T.rc);
            }
        }


        public static void main(String[] args) {
            BinT T=new BinT();

            T.head=CreateBT(T);

            T.preorder(T);



        }
    
    
}
