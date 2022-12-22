import java.util.Scanner;

public class Linked {

    Node head;

    static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=next;
        }
    }

    public static Linked insert(Linked L,int data)
    {

        Node newnode=new Node(data);

        if(L.head==null)
        {
            L.head=newnode;
        }
        else
        {
           // System.out.println(L.head.data);
            Node last=L.head;
            while(last.next!=null)
            {
                last=last.next;
            }
            last.next=newnode;
        }

        return L;
    }

    public static void print(Linked L)
    {
        Node print=L.head;
        while(print!=null)
        {
            System.out.print(print.data+ " ");
            print=print.next;
        }
    }

    public static void main(String[] args) {

        Linked L=new Linked();

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        while(n!=-1)
        {
            L=insert(L, n);
            n=sc.nextInt();
        }

        L.print(L);
        

    }
    
}
