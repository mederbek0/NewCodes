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
        tree.addNode(1);
        
        
        //second tree
        List tree1=new List();
        tree1.addNode(4);
        tree1.addNode(3);
        tree1.addNode(0);
        tree1.addNode(10);
        tree1.addNode(12);
        tree1.addNode(-1);
        
        
        tree.preorderTraverse();
        System.out.println();
        tree.inorderTraverse();
        System.out.println();
        tree.postorderTraverse();
        System.out.println();
        System.out.println(tree.sizeof());
        
        if (isIdentical(tree.head,tree1.head))
            System.out.println("Indentical");
        else
            System.out.println("Not Identical");
        System.out.println(tree.depth(tree.head));
        tree.inorderTraverse();

        tree.mirror(tree.head);
        System.out.println();
        tree.inorderTraverse();

    }
    public static boolean isIdentical(Node x,Node y){
        
        if ((x==null) && (y==null))
            return true;
        if (x!=null && y!=null)
           if (x.getData()==y.getData())
            return isIdentical(x.getLeft(),y.getLeft()) && isIdentical(x.getRight(),y.getRight());
        return false;
    }
   
    
    
}
