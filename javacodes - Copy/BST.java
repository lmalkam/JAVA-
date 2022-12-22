
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lines
 */

class BST{
    
    class Node{
    int val;
    Node left;
    Node right;
    
    public Node(int val)
    {
        this.val=val;
        this.left=null;
        this.right=null;
    }
    }
    
    
    Node Tree;
    
    BST()
    {
        Tree=null;
    }
    
    void insert(int val)
    {
        Tree=insertfun(Tree,val);
    }
    
    Node insertfun(Node Tree,int key){
        
        if(Tree==null)
        {
            Tree=new Node(key);
            return Tree;
        }
        
        if(key<Tree.val)
        {
            Tree.left=insertfun(Tree.left,key);
        }
        if(key>Tree.val)
        {
            Tree.right=insertfun(Tree.right,key);
        }
        
        return Tree;
        
    }
    
    void preorder()
    {
        if(Tree!=null)
        {
            preorder(Tree.left);
            System.out.println(Tree.val);
            preorder(Tree.right);
        }
    }
    
}



public class codess {
    
    public static void main(String[] args){
    
    BST tree=new BST();
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

    while(n!=-1)
    {
        tree.insert(n);
        n=sc.nextInt();
    }

    tree.preorder();
    }

    
   
    
}
 
