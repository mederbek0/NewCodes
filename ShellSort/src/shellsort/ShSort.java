/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shellsort;

/**
 *
 * @author mederbekbegmatov
 */
public class ShSort {
    private int ar[];
    private int size;
    private int k;
    //constructor
    public ShSort(int n)
    {
        ar=new int[n];
        size=n;
        k=0;
    }//end constructor
    //insert item into array
    public void insert(int n)
    {
        ar[k++]=n;
    }//end insertion
    //printing array
    public void display()
    {
        for(int i=0;i<size;i++)
            System.out.print(ar[i]+" ");
        System.out.println();
    }//end print
    //sorting
    public void sSort()
    {
        int h=1,i,temp,hout;
        while ((h*3)+1<size)
         h=(h*3)+1;
        while (h>0)
        {
                hout=h;
            while (hout<size)
            {    
                i=hout;
                temp=ar[i];
                while (temp<ar[i-h] && i>=0)
                        {
                            ar[i]=ar[i-h];
                            i=i-h;
                            if (i-h<0)
                                break;
                        }
                ar[i]=temp;
                
                hout+=h;
            }
        h=(h-1)/3;
        }
    }
    
}
