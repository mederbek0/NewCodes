/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cars;

/**
 *
 * @author mederbekbegmatov
 */
public class Cars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Car bmw=new BMW();
        bmw.display();
        bmw.getEngineType();
        bmw.setEngineType(new V6());
        bmw.getWeightType();
        bmw.setWeightType(new HeavyWeight());
        bmw.getEngineType();
        bmw.getWeightType();
    }
    
}
