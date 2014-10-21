/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mergesort;

//import java.util.Scanner;

/**
 *
 * @author mederbekbegmatov
 */
public class Sortm {
    private int[] ar;
    private int size;
    private int i;
    public Sortm(int n)
    {
        ar=new int[n];
        this.size=n;
        this.i=0;
    }
    public void insert(int n)
    {
        
            ar[this.i++]=n;
        
    }//end insert
    //print array
    public void display()
    {
        for (int j=0;j<this.size;j++)
            System.out.print(ar[j]+" ");
        System.out.println();
    }//end print
    public void mergeS(int low,int high)
    {
        int[] a=new int[size];
        mergeSort(a,low,high);
    }
    public void mergeSort(int[] a, int low ,int high)
    {
        if(low==high)
            return;
        else
        {
            int mid=(low+high)/2;
            mergeSort(a,low,mid);
            mergeSort(a,mid+1,high);
            merge(a,low,mid,high);
        }
    }
    //merge
    public void merge(int[] a,int low, int mid,int high){
        int k=low,count=0;
        int j=mid+1;
        
        while(k<=mid && j<=high)
        {
            if (ar[k]<ar[j])
            {
               a[count++]=ar[k++];
            }
            else
               a[count++]=ar[j++];
        }
        while(k<=mid)
        {
            a[count++]=ar[k++];
        }
        while(j<=high)
        {
            a[count++]=ar[j++];
        }
        for (k=0;k<count;k++)
            ar[low+k]=a[k];
    }
}
