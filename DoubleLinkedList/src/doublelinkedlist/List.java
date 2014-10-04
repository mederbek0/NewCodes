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
    // //Delete node
    public void DeleteNode( int Data)
    {
        Node tmp=head;
        boolean yes=false;
        while(tmp!=null && !yes)
        {
            if(tmp.getData()==Data)
            {
                tmp.getNext().setPrev(tmp.getPrev());
                tmp.getPrev().setNext(tmp.getNext());
                yes=true;
            }
            tmp=tmp.getNext();
        }
    }
    public void InsertNodetoSorted(int data){
        Node tmp=new Node(data);
        Node r=head;
        boolean yes=false;
        while((!yes) && (r!=null))
        {
            if (r.getNext()!=null)
            if(r.getData()<=tmp.getData() && r.getNext().getData()>=tmp.getData())
            {
                r.getNext().setPrev(tmp);
                tmp.setNext(r.getNext());
                tmp.setPrev(r);
                r.setNext(tmp);
                yes=true;
                System.out.println("a");
            }
            r=r.getNext();
        }
            if(head!=null){
            if(!yes && head.getData()>tmp.getData())
                AddToBeginning(data);
            else if(!yes && head.getData()<tmp.getData())
                AddToEnd(data);
            }else
                AddToBeginning(data);
                    
            
                
    }
    //Print List
    public void print(){
        Node r;
        r=head;
        while(r!=null)
        {
            System.out.print(r.getData()+" ");
            r=r.getNext();
        }
    System.out.println();
    }
    
}
