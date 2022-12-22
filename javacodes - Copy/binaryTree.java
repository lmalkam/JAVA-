import java.util.Scanner;

class node1 {
    String data;
    node1 right;
    node1 left;

    node1(String data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class binaryTree {

    public static node1 cbt(node1 t) {

        Scanner sc = new Scanner(System.in);
        String c;
        c = sc.next();
        if (c.equals("#")) {
            return null;
        }
        t = new node1(c);
        t.left=cbt(t.left);
        t.right=cbt(t.right);
        return t;
    }

    public static void print(node1 k) {
        if (k == null)
            return;
        else {
            System.out.print(k.data + " ");
            print(k.left);
            print(k.right);
        }
    }

    public static void main(String[] args) {
        binaryTree bt = new binaryTree();
        node1 root = null;
        root=cbt(root);
        print(root);
    }
} 
