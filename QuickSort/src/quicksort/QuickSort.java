/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quicksort;
import java.util.Scanner;
/**
 *
 * @author mederbekbegmatov
 */
public class QuickSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        Srt a=new Srt(n);
        for (int i=0;i<n;i++)
        {   
            int k=in.nextInt();
            a.insert(k);
    
        }
        a.display();
        a.Qksort();
        a.display();
    }
    
}
