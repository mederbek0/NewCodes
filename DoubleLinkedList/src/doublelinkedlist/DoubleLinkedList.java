/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package doublelinkedlist;

/**
 *
 * @author mederbekbegmatov
 */
public class DoubleLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    List a= new List();
    a.AddToEnd(1);
    a.AddToEnd(5);
    a.AddToEnd(2);
    a.AddToEnd(4);
    a.print();
    a.AddToEnd(7);
    a.AddToBeginning(10);
    a.AddToBeginning(11);
    a.print();
    }
    
}
