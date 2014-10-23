/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quicksort;

/**
 *
 * @author mederbekbegmatov
 */
public class Srt {
    private int[] ar;
    private int size;
    private int k;
    public Srt(int n)
    {
        ar=new int[n];
        size=n;
        k=0;
    }
    public void insert(int n)
    {
        ar[k++]=n;
    }
    public void display()
    {
        for (int i=0;i<k;i++)
            System.out.print(ar[i]+" ");
        System.out.println();
    }
    public void Qsort(int left,int right)
    {
        if (right<=left)
            return;
        else
        {
            int pivot=ar[right];
            int part=partition(left,right,pivot);
            Qsort(left,part-1);
            Qsort(part+1,right);
        }
    }
    public int partition(int left,int right,int pivot)
    {
        int pleft=left-1;
        int pright=right;
        while(true)
        {
            while(ar[++pleft]<pivot && pleft<size)
                ;
            while (pright>0 && ar[--pright]>pivot );
            if (pleft>=pright)
                break;
            swap(pleft,pright);     
        }
        swap(pleft,right);
        
        return pleft;
    }
    public void swap(int left,int right)
    {
        int temp=ar[right];
        ar[right]=ar[left];
        ar[left]=temp;
    }
    public void Qksort()
    {
        Qsort(0,size-1);
    }
    
    
    
}
