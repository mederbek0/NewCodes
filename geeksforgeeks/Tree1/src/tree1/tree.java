/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tree1;

/**
 *
 * @author mederbekbegmatov
 * @param <T>
 */
public class tree <T extends Comparable<T> > {
    private Node head;
    public tree()
    {
        this.head=null;
    }

    /**
     * @return the head
     */
    public Node getHead() {
        return head;
    }

    /**
     * @param head the head to set
     */
    public void setHead(Node head) {
        this.head = head;
    }
    //adding Node to the tree helper function
    public void add(T x)
    {
        head=put(head,x);
    }
    //add Node the tree main function
    public Node put(Node current, T x)
    {
        if (current==null)
            return new Node(x);
        int i=current.getData().compareTo(x);
        if (i>0)
        {
            current.setLeft(put(current.getLeft(),x));     
        }
        else if (i<0)
        {
            current.setRight(put(current.getRight(),x));
        }
        else
            current.setData(x);
            
            
     return current;   
    }
    
    public void print()
    {
        inorderPrint(head);
    }
    public void inorderPrint(Node current)
    {
        if (current==null)
            return;
        inorderPrint(current.getLeft());
        System.out.print(current.getData()+" ");
        inorderPrint(current.getRight());
    }
   
    
    
    
}
