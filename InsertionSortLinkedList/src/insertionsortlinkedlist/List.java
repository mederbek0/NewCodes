/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package insertionsortlinkedlist;


/**
 *
 * @author mederbekbegmatov
 */
public class List {
    private Node head;
    public List(){
        this.head=null;
    }
    
//Add Node to the End
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
//add Node to the begining           
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
//Delete node
    public void DeleteNode( int Data)
    {
        Node tmp=head;
        boolean yes=false;
        while(tmp!=null && !yes)
        {
            if(tmp.getData()==Data && tmp!=head)
            {
                tmp.getNext().setPrev(tmp.getPrev());
                tmp.getPrev().setNext(tmp.getNext());
                yes=true;
            } 
            else if(tmp.getData()==Data && tmp==head)
            {
                head=tmp.getNext();
                yes=true;
            }
            
            tmp=tmp.getNext();
        }
    }
//Insert Node into sorted array    
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
//Insertion Sort    
    public List Sort()
    {
        List a =new List();
        Node tmp=head;
        while(tmp!=null)
        {
            a.InsertNodetoSorted(tmp.getData());
            tmp=tmp.getNext();
        }
        
        return a;
       
    }
//Checks list...is it sorted or not
    public boolean isSorted(){
        Node r=head;
        boolean yes=false,yes1=false;
        int counter=0,size=0,size1=0;
        if(r!=null)
        while(r.getNext()!=null)
        {
            if(r.getData()<r.getNext().getData())
               counter++;
            else if(r.getData()>r.getNext().getData())
                counter--;
            else
                size1++;
            r=r.getNext();
            size++;    
        }
        if (size==(abs(counter)+size1))
            return true;
        else
            return false;
    }
//finding absolute value
    public int abs(int a){
        if(a<0)
            a=a*(-1);
        return a;
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
