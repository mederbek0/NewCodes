/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package seperatechaining;

/**
 *
 * @author mederbekbegmatov
 */
public class hashTable {
    private List[] hasharray;
    private int size;
    //constructor
    public hashTable(int size)
    {
        this.size=size;
        hasharray=new List[size];
    }
    //hashfunction
    public int hashfunct(int i)
    {
       // System.out.println("i= "+i+"t= "+this.size+" % "+i%this.size);
        return i % this.size;
    }
    //insert function
    public void insert(int i)
    {
     //   System.out.println(hashfunct(i)+" = "+size);
        if(hasharray[hashfunct(i)]!=null)
            hasharray[hashfunct(i)].add(i);
        else
        {
            hasharray[hashfunct(i)]=new List();
            hasharray[hashfunct(i)].add(i);
        }
    }
    //delete function
    public void delete(int i)
    {
        if(hasharray[hashfunct(i)]!=null)
            hasharray[hashfunct(i)].delete(i);
        else 
            System.out.println("Not found");
    }
    public void display()
    {
        for (int i=0;i<this.size;i++)
        {   
            if(hasharray[i]!=null)
                if (hasharray[i].first==null)
                    hasharray[i]=null;
            if (hasharray[i]!=null){
                hasharray[i].print();
               //System.out.print("b");   
            }
           else 
               System.out.println("*");
    
        }
    }
}
