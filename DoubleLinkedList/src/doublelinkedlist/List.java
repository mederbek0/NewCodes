/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package doublelinkedlist;

/**
 *
 * @author mederbekbegmatov
 */
public class List {
    private Node head;
    public List(){
        this.head=null;
    }
    
    //Add to End
    public void AddToEnd(int data){
        Node tmp= new Node(data);
        if(head==null)
        {        
            head=tmp;
            
        }
        else{
            Node r=head;
            while(r.getNext()!=null)
            {
                r=r.getNext();

            }
            r.setNext(tmp);
            tmp.setPrev(r);
        }
           
    }
    public void AddToBeginning(int data)
    {
        Node tmp=new Node(data);
        if (head==null)
            head=tmp;
        else
        {
            head.setPrev(tmp);
            tmp.setNext(head);
            head=tmp;
        }
    }
    //Print List
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
