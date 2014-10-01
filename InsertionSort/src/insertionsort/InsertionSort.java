/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package insertionsort;

import java.util.Scanner;
import java.io.*;
import java.util.*;

/**
 *
 * @author mederbekbegmatov
 */
public class InsertionSort {

    
    public static void insertionSortPart2(int[] ar)
    {       
        int s,i,j,r;
        boolean yes;
        s=ar.length;
        for (i=1;i<s;i++)
        {
            j=i-1;
            yes=false;
            r=ar[i];
            while(j>=0 && r<ar[j])
            {
                 ar[j+1]=ar[j];
                 j--;
                 yes=true;
            }
            if (yes)
                ar[j+1]=r;
            printArray(ar);    
        
        }
            
    
    }  
    
    
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar);    
                    
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
}
