/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trial;

/**
 *
 * @author mederbekbegmatov
 */
public class Trial {
    static int[] arr;
    /**
     * @param args the command line arguments
     */
     public static boolean isPalindrome(String s)
    {
       int start=0,end=s.length()-1;
       while (start<end)
       {
           if (s.charAt(start)!=s.charAt(end))
               return false;
           start++;
           end--;
       }
       
        return true;   
    }
    //function to call recursion
    public static void SequenceNumbers(int k, int n)
    {
        int length=0;
        arr=new int[k];
        Sequence(k,n,length);
    }
    public static void Sequence(int k, int n,int length)
    {
        int i;
        if (length==k)
        {
            printArr(arr);
            return;
        }
        if (length==0)
        {
            i=1;
        }
        else
        {
            i=arr[length-1]+1;
        }
        length++;
        while (i<=n)
        {
            arr[length-1]=i;
            Sequence(k,n,length);
            i++;
        }
        length--;
            
    }
    public static void printArr(int[] arr)
    {
        for (int i=0;i<arr.length;i++)
            System.out.print(arr[i]);
        System.out.println();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(isPalindrome("abbbbca"));
        SequenceNumbers(3,7);
    }
   
    
}

