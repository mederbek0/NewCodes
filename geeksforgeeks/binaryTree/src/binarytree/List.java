/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package binarytree;

/**
 *
 * @author mederbekbegmatov
 */
public class List {
     Node head;
    Node top=head;
    //constructor
    public List()
    {
     this.head=null;
    }
    //add node
    public void addNode(int x)
    {
       head=putNode(head,x);
    }
    public Node putNode(Node current,int x)
    {
     if (current==null)
     {
         return new Node(x);
     }
     if (current.getData()>x)
         current.setLeft(putNode(current.getLeft(),x));
     else if (current.getData()<x)
         current.setRight(putNode(current.getRight(),x));
     else
         current.setData(x);
        
     return current;
        
    }
    //inorder traverse
    public void inorderTraverse()
    {
        printInorder(head);
    }
    public void printInorder(Node current)
    {
        if (current == null)
            return;
        printInorder(current.getLeft());
        System.out.print(current.getData()+" ");
        printInorder(current.getRight());
    }
    
    //preorder Traverse
    public void preorderTraverse()
    {
        printPreorder(head);
    }
    public void printPreorder(Node current)
    {
        if (current == null)
            return;
        System.out.print(current.getData()+" ");
        printPreorder(current.getLeft());
        printPreorder(current.getRight());
    }
    
    //PostOrder Traverse
    public void postorderTraverse()
    {
        printPostorder(head);
    }
    public void printPostorder(Node current)
    {
        if (current == null)
            return;
        printPostorder(current.getLeft());
        printPostorder(current.getRight());
        System.out.print(current.getData()+" ");
        
    }
    public int sizeof()
    {
        return size(head);
    }
    public int size(Node current)
    {
        if (current==null)
            return 0;
        else
            return size(current.getLeft())+1+size(current.getRight());
    }
    public int depth(Node current)
    {
        if (current==null)
            return 0;
        else
            return max(depth(current.getLeft()),depth(current.getRight()))+1;
        
    }
    public int max(int val1,int val2)
    {
        if (val1>val2)
            return val1;
        else
            return val2;
    }
    
    public void mirror(Node current)
    {
        if (current== null)
            return;
        else
        {
            mirror(current.getLeft());
            mirror(current.getRight());
            Node tmp = current.getLeft();
            current.setLeft(current.getRight());
            current.setRight(tmp);
        }
    }
}
