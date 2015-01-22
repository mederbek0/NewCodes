/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package levelordertraverse;
import java.util.*;
/**
 *
 * @author mederbekbegmatov
 */
public class Tree<T extends Comparable<T>> {
    private Node root;
    public Tree()
    {
        root=null;
    }
    //add node to tree
    public void add(T x)
    {
        root=putNode(root,x);
    }
    public Node putNode(Node current, T x)
    {
        if (current==null)
        {
            return current=new Node(x);
        }
        int i=current.getData().compareTo(x);
        if (i>0)
            current.setLeft(putNode(current.getLeft(),x));
        else if (i<0)
            current.setRight(putNode(current.getRight(),x));
        else
            current.setData(x);
         
        return current;
    }
    //print Tree
    public void print()
    {
        inorderPrint(root);
    }
    public void inorderPrint(Node current)
    {
        if (current==null)
            return;
        inorderPrint(current.getLeft());
        System.out.print(current.getData()+" ");
        inorderPrint(current.getRight());
    }
    public void printLevelOrder()
    {
        Queue<Node> list=new LinkedList<Node>();
        Node current=root;
        list.add(root);
        while(!list.isEmpty())
        {
            Node tempNode=list.poll();
            System.out.print(tempNode.getData()+" ");
            if (tempNode.getLeft()!=null)
                list.add(tempNode.getLeft());
            if (tempNode.getRight()!=null)
                list.add(tempNode.getRight());
            
        }
    }
    
    
    
}
