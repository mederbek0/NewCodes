/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mark.and.toys;
import java.util.Scanner;
/**
 *
 * @author mederbekbegmatov
 */
public class MarkAndToys {
    static int[] a;
    static int n;
    public static void sort(int start,int end)
    {
       if(start>=end)
           return;
       else
       {
           int pivot=a[end];
            int part=partition(start,end,pivot);
            int mid=(start+end)/2;
            sort(start,part-1);
            sort(part+1,end);
        }
    } 
    public static int partition(int start,int end,int pivot)
    {
        int end1=end;
        start=start-1;
        while(true)
        {
           // System.out.println("S:E"+start+" "+end);
            while((start<n-1)&&(a[++start]<pivot));
            while ((end>0) &&(a[--end]>pivot));
                
            if (start>=end)
                break;
            swap(start,end);
            
        }
        swap(start,end1);
        return start;
    }
    public static void swap(int a1,int b)
    {
        int temp=a[a1];
        a[a1]=a[b];
        a[b]=temp;
       
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in= new Scanner(System.in);
      n=in.nextInt();
      int money=in.nextInt();
      int i,count=0,count1=0;
      a= new int[n];
      for (i=0;i<n;i++)
          a[i]=in.nextInt();
      for (i=0;i<n;i++)
          System.out.print(a[i]+" ");
     // System.out.println();
      sort(0,n-1);
      
      for (i=0;i<n;i++)
          if (money>=count+a[i])
          {
              count=count+a[i];
              count1++;
          }
      System.out.println(count1);
    }
    
}
