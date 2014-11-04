/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pangrams;
import java.util.Scanner;
/**
 *
 * @author mederbekbegmatov
 */
public class Pangrams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        String s;
        int i,n;
        int[] a=new int[255];
        boolean yes=false;
        s=in.nextLine();
         for (i=0;i<26;i++)
             a[i]=0;
        n=s.length();
        s=s.toLowerCase();
        for (i=0;i<n;i++)
            if (s.charAt(i)-97>=0)
                a[s.charAt(i)-97]++;
        for (i=0;i<26;i++)
            if (a[i]<1)
                yes=true;
        if (yes)
            System.out.println("not pangram");
        else
            System.out.println("pangram");
        //for (i=0;i<26;i++)
          //  System.out.println((char)i+":"+a[i]);
    }
    
}
