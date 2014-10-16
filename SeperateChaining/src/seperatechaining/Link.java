/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package seperatechaining;

/**
 *
 * @author mederbekbegmatov
 */
public class Link {
    private int data;
    private Link next=null;
    //constructor with data
    public Link(int data)
    {
        this.data=data;
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
    public Link getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Link next) {
        this.next = next;
    }
    
}
