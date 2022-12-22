import java.util.Scanner;

class lnode{

    int val;
    lnode next;

    public lnode(int n)
    {
        this.val=n;
        this.next=null;
    }
}


class LinkedList{

    lnode l;

    void Linkedlist(){
        l=null;
    }

    lnode findend(lnode l)
    {
        if(l.next==null)
        return l;
        return findend(l.next);
    }

    void addafter(lnode L,int n)
    {
       // System.out.println("blank"+n);
        if(L==null)
        {
       //     System.out.println(n);
            L=new lnode(n);
            return;
        }
        else
        {
            System.out.println(L.val);
            lnode T=new lnode(n);
            lnode X=findend(L);
            X.next=T;
            return;
        }
    }

    lnode Create(lnode L,int n){
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        while(n!=-1)
        {
            addafter(L,n);
          //  System.out.println(n);
            n=sc.nextInt();
        }
        return L;
    }

    public void print(lnode L)
    {
        if(L!=null)
        {
            System.out.println(L.val + " ");
            print(L.next);
        }
    }
}




public class LL {

    public static void main(String[] args) {

    LinkedList List=new LinkedList();

    lnode L=null;

    List.Create(L,1);

    List.print(L);
        
    }

}
