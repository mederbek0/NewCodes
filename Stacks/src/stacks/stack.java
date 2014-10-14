/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stacks;

/**
 *
 * @author mederbekbegmatov
 */
public class stack {
    private Node head;
    private Node tail;
    private int size=0;
    public stack(){
    this.head=null;
    this.tail=null;
    }
 //push
    public void push(int data)
    {
        Node tmp=new Node(data);
        Node r=head;
        if(r==null)
        {
            
            r=tmp;
            head=r;
            size++;
            tail=tmp;
        }
        else 
        {
            while (r.getNext()!=null)
            {
                r=r.getNext();
            }
            r.setNext(tmp);
            tail=tmp;
            size++;
        }
        
    }
//Pop    
    public int pop()
    {
        Node r=tail;
        Node r1=tail;
        tail=r.getPrev();
        tail.setNext(null);
        size--;
        return r1.getData();
    }
//Size
    public int getSize()
    {
        return size;
    }
//print
    public void print()
    {
        Node r=head;
        while(r!=null)
        {
            System.out.println(r.getData());
            r=r.getNext();
        }
    }
    
}
