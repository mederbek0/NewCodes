/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package brackets;
import java.util.Scanner;
/**
 *
 * @author mederbekbegmatov
 */
public class Brackets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String s;
        s=in.nextLine();
        check r=new check(s);
        if (r.checking())
            System.out.println("yes");
        else
            System.out.println("no");
    }
    
}
