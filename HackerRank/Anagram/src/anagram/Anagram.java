/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package anagram;
import java.util.Scanner;
import java.lang.String;
import java.util.*;
/**
 *
 * @author mederbekbegmatov
 */
public class Anagram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner in =new Scanner(System.in);
    String[] s;
    String s1;
    int i,n,j,k,count;
    int[] a,b;
    a=new int[26];
    b=new int[26];
    n=in.nextInt();
    s = new String[n];
    s[0]=in.next();
    for (i=1;i<n;i++)
    {
       s[i]=in.next();
     
    }   
     for (i=0;i<n;i++)
    {
        count=0;
        for (j=0;j<26;j++)
        {
            a[j]=0;
            b[j]=0;
        }
        k=s[i].length();
        if (k%2==0)
        {
            for(j=0;j<k/2;j++)
            {     
              // System.out.println(s[i].charAt(j)+";");
                a[s[i].charAt(j)-97]++; 
            }
            for(j=k/2;j<k;j++)
               b[s[i].charAt(j)-97]++;
            for(j=0;j<26;j++)
            {
                if(a[j]>b[j])
                    count+=(a[j]-b[j]);
            }    
            System.out.println(count);
            
        }
        else
            System.out.println(-1);
            
    }
  
    }
    
    
}
