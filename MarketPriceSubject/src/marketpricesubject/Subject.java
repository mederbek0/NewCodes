/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package marketpricesubject;
import java.util.Observable;
import java.util.Observer;
/**
 *
 * @author mederbekbegmatov
 */
public class Subject extends Observable{
    private float Potatoes;
    private float Onions;
    private float Carrots;
    private float Bananas;
    private float Apples;
    //constructor
    public Subject(){}
    //end constructor
    //update Prices
    public void SetPrices(float potatoes,float onions, float carrots, float bananas,float apples)
    {
        this.Potatoes=potatoes;
        this.Apples=apples;
        this.Carrots=carrots; 
        this.Onions=onions;
        this.Bananas=bananas;
        PriceChanged();
    }
    public void PriceChanged()
    {
        setChanged();
        notifyObservers();
    }
    /**
     * @return the Potatoes
     */
    
    public float getPotatoes() {
        return Potatoes;
    }

    /**
     * @return the Oninions
     */
    public float getOnions() {
        return Onions;
    }

    /**
     * @return the Carrots
     */
    public float getCarrots() {
        return Carrots;
    }

    /**
     * @return the Banana
     */
    public float getBananas() {
        return Bananas;
    }

    /**
     * @return the Apple
     */
    public float getApples() {
        return Apples;
    }
    
    
}
