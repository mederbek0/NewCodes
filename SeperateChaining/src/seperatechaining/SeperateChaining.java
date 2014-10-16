/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package seperatechaining;
import java.util.Scanner;
/**
 *
 * @author mederbekbegmatov
 */
public class SeperateChaining {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in =new Scanner(System.in);
        int size,n,i,temp,temp2;
        boolean yes=false;
        size=in.nextInt();
        hashTable a=new hashTable(size);
        n=in.nextInt();
        for(i=0;i<n;i++)
        {
            temp=in.nextInt();
            a.insert(temp);
        }
        a.display();
        while(!yes)
        {
            System.out.println("Type 1: to add, 2: to delete ,3: to exit");
            temp=in.nextInt();
            if(temp==1)
            {
                temp2=in.nextInt();
                a.insert(temp2);
            } else if(temp==2)
            {
                temp2=in.nextInt();
                a.delete(temp2);
            } else if(temp==3)
            {
                temp2=in.nextInt();
               yes=true;
               return ;
            };
            a.display();
            
             
            
        }
    }
    
}
