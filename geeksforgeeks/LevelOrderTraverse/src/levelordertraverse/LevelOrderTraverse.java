/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package levelordertraverse;
import java.util.*;
/**
 *
 * @author mederbekbegmatov
 */
public class LevelOrderTraverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tree<Integer> tr=new Tree<Integer>();
        tr.add(5);
        tr.add(0);
        tr.add(2);
        tr.add(20);
        tr.add(13);
        tr.add(21);
        tr.print();
        System.out.println();
        tr.printLevelOrder();
        
    }
    
}
