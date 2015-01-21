/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package treetraverse;

/**
 *
 * @author mederbekbegmatov
 */
public class TreeTraverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tree<Integer> k=new Tree<Integer>();
        k.add(20);
        k.add(10);
        k.add(-1);
        k.add(40);
        k.add(12);
        k.add(100);
        k.add(11);
        k.add(13);
        k.print();
        System.out.println();
        k.printBranches();
        
        
    }
    
}
