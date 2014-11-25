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
public class BMW extends Car {
    public BMW()
    {
      EngineType= new V4();
      WeightType=new lightWeight();
    }
    public void display()
    {
        System.out.println("BMW");
    }
    
}
