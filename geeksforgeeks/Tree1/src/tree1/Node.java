/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tree1;

/**
 *
 * @author mederbekbegmatov
 * @param <T>
 */
public class Node <T extends Comparable<T>> {
    private Node left;
    private Node right;
    private T data;
    //constructor
    public Node (T x)
    {
        this.data=x;
        this.left=null;
        this.right=null;
        
    }
    /**
     * @return the left
     */
    public Node getLeft() {
        return left;
    }

    /**
     * @param left the left to set
     */
    public void setLeft(Node left) {
        this.left = left;
    }

    /**
     * @return the right
     */
    public Node getRight() {
        return right;
    }

    /**
     * @param right the right to set
     */
    public void setRight(Node right) {
        this.right = right;
    }

    /**
     * @return the data
     */
    public T getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(T data) {
        this.data = data;
    }
    
    //
    
    
}
