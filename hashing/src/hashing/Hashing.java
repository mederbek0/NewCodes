/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hashing;
import java.util.Scanner;

/**
 *
 * @author mederbekbegmatov
 */
public class Hashing {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in =new Scanner(System.in);
        int size,i,n,r;
        DataItem temp;
        size=in.nextInt();
        hashTable m=new hashTable(size);
        System.out.println("number of items");
        n=in.nextInt();
        for (i=0;i<n;i++)
        {
            r=in.nextInt();
            temp= new DataItem(r);
            m.Insert(temp);
        }
        m.displayTable();
        r=in.nextInt();
        m.Delete(r);
        System.out.println("Deleted: ");
        m.displayTable();
        r=in.nextInt();
        temp= new DataItem(r);
        m.Insert(temp);
        m.displayTable();
        
    }
    
}
