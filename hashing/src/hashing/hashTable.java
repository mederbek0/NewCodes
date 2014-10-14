/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hashing;

/**
 *
 * @author mederbekbegmatov
 */
public class hashTable {
    private DataItem[] hashArray;
    private int size;
    private DataItem emptyCell;
    //constructor
    public hashTable(int size)
    {
        this.hashArray = new DataItem[size];
        this.size=size;
        this.emptyCell = new DataItem(-1);
    }//end constructor
    ///Printing Table
    public void displayTable()
    {
        System.out.print("HashTable: ");
        for (int i=0;i<size;i++)
        {
            if (hashArray[i]!=null)
                System.out.print(hashArray[i].getKey()+" ");
            else
                System.out.print("* ");
            
        }
        System.out.println();
            
    }//end printing Table
    public int hashFunc(int key)
    {
        return key%size;// Hash Function
    }
    //insertion
    public void Insert(DataItem item)
    {
        int key=item.getKey();
        int hashVal=hashFunc(key);
        while(hashArray[hashVal]!=null && hashArray[hashVal].getKey()!=-1)
        {
            hashVal++;
            hashVal=hashVal%size;
        }
        hashArray[hashVal]=item;//insertion
    }
    //deletion
    public DataItem Delete(int key)
    {
        int hashVal=hashFunc(key);
        while(hashArray[hashVal]!=null)
        {
            if(hashArray[hashVal].getKey()==key)
            {
                DataItem temp= hashArray[hashVal];
                hashArray[hashVal]=emptyCell;
                return temp;
            }
            hashVal++;
            hashVal%=size;
        }
        
        return null;
    }
    //end deletion
    public DataItem find(int key)
    {
        int hashVal=hashFunc(key);
        while(hashArray[hashVal]!=null)
        {
            if(hashArray[hashVal].getKey()==key)
            {
                return hashArray[hashVal];
            }
            hashVal++;
            hashVal%=size;
        }
        
        return null;
    }
    
    
    
}
