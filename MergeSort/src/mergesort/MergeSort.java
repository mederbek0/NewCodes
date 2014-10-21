/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mergesort;
import java.util.Scanner;
/**
 *
 * @author mederbekbegmatov
 */
public class MergeSort {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int n,i;
        n=in.nextInt();
        Sortm m=new Sortm(n);
        for (i=0;i<n;i++)
        {   
            int l=in.nextInt();
            m.insert(l);
    
        }
        m.display();
        m.mergeS(0,n-1);
        m.display();
    }
    
    
}
