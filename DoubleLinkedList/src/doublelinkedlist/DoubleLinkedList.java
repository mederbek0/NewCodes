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
    a.AddToEnd(9);
    a.AddToEnd(8);
    a.AddToEnd(7);
    a.AddToEnd(6);
    a.print();
    a.AddToEnd(5);
   // a.AddToBeginning(1);
   // a.AddToBeginning(1);
   // a.AddToBeginning(1);
   // a.AddToBeginning(1);
    a.print();
    a.DeleteNode(1);
    a.print();
    //a.InsertNodetoSorted(10);
    a.print();
    System.out.println(a.isSorted());
    }
  
    
    
}
