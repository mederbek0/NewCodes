/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package linkedlist;

/**
 *
 * @author mederbekbegmatov
 */
public class List {
    private Node head;
    public List(){
        this.head=null;
    }
//ADD New Node to the end of a List
    public void addToEnd(int a)
    {
        Node tmp = new Node(a);
        if (head==null)
            head=tmp;
        else
        {
            Node r=head;
            while(r.getNext()!=null)
            {
                r=r.getNext();
            }
        r.setNext(tmp);    
        }        
    }
//Add node to the beginning of list    
    public void addToBeginning(int a)
    {
        Node tmp =new Node(a);
        if(head==null)
            head=tmp;
        else
        {
            tmp.setNext(head);
            head=tmp;
        }
    }
//find the largest Item;
    public int findMax(){
        int max=head.getData();
        
        Node tmp=head;
        while (tmp!=null){
            if (max<tmp.getData())
                max=tmp.getData();
         
            tmp=tmp.getNext();
        }
        return max; 
    }
//Printing list
    public void print(){
    Node r;
    r=head;
    while(r!=null)
    {
        System.out.println(r.getData());
        r=r.getNext();
    }
    
    }
    
    
    
}
