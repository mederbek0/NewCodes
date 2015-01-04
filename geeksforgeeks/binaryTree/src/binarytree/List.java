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
    public void printTree()
    {
        print(head);
    }
    public void print(Node current)
    {
        if (current == null)
            return;
        print(current.getLeft());
        System.out.print(current.getData()+" ");
        print(current.getRight());
    }
}
