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
        tr.add(29);
        tr.add(24);
        tr.add(31);
        tr.add(-1);
        tr.add(3);
        tr.add(1);
        tr.add(14);
        tr.add(12);
        tr.print();
        System.out.println();
        tr.printLevelOrder();
        System.out.println();
        tr.spiralLevelOrderTraverse();
        
    }
    
}
//             5
//         /        \
//        0         20
//       /   \       / \
//      -1   2     13  21
//           /\           \
//          1  3           29
//                         / \   
//                        24  31  