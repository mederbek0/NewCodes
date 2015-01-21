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
public class List <T extends Comparable> {
    Node head;
    public List()
    {
        head=null;
    }
    public void printList()
    {
        Node current=head;
        while(current!=null)
        {
            System.out.print(current.getData()+" ");
            current=current.getNext();
        }
        System.out.println();
    }
    public void addList(T x)
    {
        
        if (head==null)
        {
            head=new Node(x);
         //   System.out.print("k"+x);
        }else{
            Node current=head;
        while(current.getNext()!=null)
        {
            current=current.getNext();
        }
        current.setNext(new Node(x));
        //System.out.print("k"+x);
        
        }
    }
    public void removeNode()
    {
       // System.out.print("K");
        if (head==null)
            return;
        Node current=head;
        Node prev=current;
        while(current.getNext()!=null)
        {
             prev=current;
            current=current.getNext();
        }
        prev.setNext(null);
    }
    
}
