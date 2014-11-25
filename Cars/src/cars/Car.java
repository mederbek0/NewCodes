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
public abstract class Car {
    EngineType EngineType;
    WeightType WeightType;
    public abstract void display();
    public void getEngineType(){
        EngineType.engine();
    }
    public void getWeightType()
    {
        WeightType.weight();
    }
    public void setEngineType(EngineType type)
    {
        EngineType=type;
    }
    public void setWeightType(WeightType type){
        WeightType=type;
    }
    
}
