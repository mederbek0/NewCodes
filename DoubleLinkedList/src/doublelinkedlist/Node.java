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
public class Node {
    private Node head;
    private int data;
    private Node next;
    private Node prev;
   //constructor 
    public Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
        
    }
    /**
     * @return the head
     */
    public Node getHead() {
        return head;
    }

    /**
     * @param head the head to set
     */
    public void setHead(Node head) {
        this.head = head;
    }

    /**
     * @return the data
     */
    public int getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(int data) {
        this.data = data;
    }

    /**
     * @return the next
     */
    public Node getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Node next) {
        this.next = next;
    }

    /**
     * @return the prev
     */
    public Node getPrev() {
        return prev;
    }

    /**
     * @param prev the prev to set
     */
    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
