import java.util.*;

class Btree
{
    class Node{
        char val;
        Node left;
        Node right;

        Node(char val)
        {
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }

    Node tree;

    Btree(){
        tree=null;
    }

    void insert(char c)
    {
        tree=ins(tree,c);
    }

    Node ins(Node Tree,char c)
    {
        if(c=='#')
        return null;
        
        System.out.println(c);
        Tree=new Node(c);    
      //  System.out.println(c);
        Tree.left=ins(Tree.left,c);
        Tree.right=ins(Tree.right,c);
        return Tree;
    }

    void preorder()
    {
        pre(tree);
    }

    void pre(Node tree)
    {
        if(tree!=null)
        {
            pre(tree.left);
            System.out.println(tree.val);
            pre(tree.right);
        }
    }
}



public class BT {

    public static void main(String[] args) {
        Btree b=new Btree();

        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();

        char[] ch = new char[s.length()];
  
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }

        for(int i=0;i<s.length();i++)
        {
            b.insert(ch[i]);
        }

        b.preorder();
    }
    
}
