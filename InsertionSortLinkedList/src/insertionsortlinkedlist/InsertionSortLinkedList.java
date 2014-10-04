/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package insertionsortlinkedlist;

/**
 *
 * @author mederbekbegmatov
 */
public class InsertionSortLinkedList {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    List a=new List();
    a.AddToBeginning(9);
    a.AddToBeginning(10);
    a.AddToBeginning(-1);
    a.AddToBeginning(0);
    a.AddToEnd(2);
    a.print();
    a=a.Sort();
    a.print();
    }
    
}
