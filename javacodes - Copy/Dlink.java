import java.util.Scanner;

public class Dlink {

    static Node head;

    static class Node{
            int value;
            Node left;
            Node right;

        Node(int value)
        {
            this.value=value;
            this.left=null;
            this.right=null;
        }
    }

    static Dlink Create(Dlink L,int n)
    {
        Node newnode=new Node(n);
        if(L.head==null)
        {
            L.head=newnode;
            newnode.left=L.head;
        }
        else
        {
            Node last=L.head;
            while(last.right!=null)
            {
                last=last.right;
            }
            last.right=newnode;
            newnode.left=last;
        }
        return L;
    }

    static void print(Dlink L)
    {
        Node print=L.head;
        while(print!=null)
        {
            System.out.print(print.value+ " ");
            print=print.right;
        }
    }

    static Dlink modify(Dlink L)
    {
        Node i=L.head;
        Node j=L.head;
        while(j.right!=null)
        {
            j=j.right;
        }
        for(int k=0;k<3;k++){
        int sum=i.value+j.value;
        int mul=i.value*j.value;
        j.value=mul;
        i.value=sum;
        i=i.right;
        j=j.left;
        }
        return L;

    }


    public static void main(String[] args) {
        Dlink L=new Dlink();

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        while(n!=-1)
        {
            L=L.Create(L,n);
            n=sc.nextInt();
        }

        L.print(L);
        System.out.println();
        L.modify(L);
        L.print(L);
        System.out.println();

        L.head=null;

        Dlink D=new Dlink();

        n=sc.nextInt();
        while(n!=-1)
        {
            D=D.Create(D,n);
            n=sc.nextInt();
        }

        D.print(D);


    }


}