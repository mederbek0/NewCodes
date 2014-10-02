/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package linkedlist;

/**
 *
 * @author mederbekbegmatov
 */
public class Linkedlist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List a=new List();
        a.addToEnd(1);
        a.addToEnd(2);
        a.addToEnd(20);
        a.addToEnd(12);
        a.addToEnd(100);
        
        a.addToBeginning(0);
        a.addToBeginning(-1);
        a.print();
        System.out.println("Largest Item in a Linked List: "+a.findMax());
    }
    
}
