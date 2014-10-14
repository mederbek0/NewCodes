/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stacks;

/**
 *
 * @author mederbekbegmatov
 */
public class Stacks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        stack a=new stack();
        a.push(4);
        a.push(4);
        a.push(2);
        a.push(0);
        a.push(2);
        a.print();
        a.pop();
        a.pop();
        a.print();
    }
    
}
