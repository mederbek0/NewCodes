/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package treetraverse;

/**
 *
 * @author mederbekbegmatov
 */
public class Tree<T extends Comparable<T>> {
    Node Root;
    List l;
    public Tree()
    {
        Root=null;
    }
    public void add(T x)
    {
        Root=putInTree(Root,x);
    }
    public Node putInTree(Node current, T x)
    {
     if (current==null)
         return current=new Node(x);
     int i=current.getData().compareTo(x);
     if (i>0)
         current.setLeft(putInTree(current.getLeft(),x));
     else if (i<0)
         current.setRight(putInTree(current.getRight(),x));
     else
         current.setData(x);
     return current;
    }
    public void print()
    {
        InorderTraverse(Root);
        
    }
    public void InorderTraverse(Node current)
    {
        if (current==null)
            return;
        InorderTraverse(current.getLeft());
        System.out.print(current.getData()+" ");
        InorderTraverse(current.getRight());
    }
    public void printBranches()
    {
        l=new List();
        printBr(Root);
        
    }
    public void printBr(Node current)
    {
        if (current.getLeft()==null && current.getRight()==null)
        {  
            l.addList(current.getData());
            l.printList();
            return;
        }
        else{
            l.addList(current.getData());
        
             if (current.getLeft()!=null)printBr(current.getLeft());
        
             if (current.getRight()!=null)printBr(current.getRight());
            
             l.removeNode();
            
        }
    }
    
    
}
