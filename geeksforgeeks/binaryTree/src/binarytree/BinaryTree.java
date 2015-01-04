/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package binarytree;

/**
 *
 * @author mederbekbegmatov
 */
public class BinaryTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List tree=new List();
        tree.addNode(4);
        tree.addNode(3);
        tree.addNode(0);
        tree.addNode(10);
        tree.addNode(12);
        tree.addNode(-1);
        
        tree.preorderTraverse();
        System.out.println();
        tree.inorderTraverse();
        System.out.println();
        tree.postorderTraverse();
    }
    
}
