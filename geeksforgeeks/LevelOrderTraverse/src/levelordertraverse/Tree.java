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
    //printing tree in spiral level traverse
    public void spiralLevelOrderTraverse()
    {
        spiralPrint(root);
    }
    
    public void spiralPrint(Node current)
    {
        Stack<Node> k=new Stack<Node>();
        Stack<Node> k1=new Stack<Node>();
        Node tempNode=root;
        k1.push(root);
        while(!k.isEmpty() ||!k1.isEmpty())
        {
            while(!k.isEmpty())
            {
                if (!k.isEmpty())
                    tempNode=k.pop();
          //
                System.out.print(tempNode.getData()+" ");
                if (tempNode.getLeft()!=null)k1.push(tempNode.getLeft());
                if (tempNode.getRight()!=null)k1.push(tempNode.getRight());
            }
            while(!k1.isEmpty())
            {
                if (!k1.isEmpty())
                    tempNode=k1.pop();
          //
                System.out.print(tempNode.getData()+" ");
                if (tempNode.getRight()!=null)k.push(tempNode.getRight());
                if (tempNode.getLeft()!=null)k.push(tempNode.getLeft());
                
                
                
                
            }
        }
         
    }
    
    
    
}
