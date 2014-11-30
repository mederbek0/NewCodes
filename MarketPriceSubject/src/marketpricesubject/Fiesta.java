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
public class Fiesta implements Observer{
    Observable observable;
    private float potatoes;
    private float carrots;
    private float bananas;
    public Fiesta(Observable observable){
        this.observable=observable;
        observable.addObserver(this);
    }
    public void update(Observable obs,Object arg)
    {
        if (obs instanceof Subject)
        {
            Subject subject=(Subject)obs;
            this.carrots=subject.getCarrots();
            this.bananas=subject.getBananas();
            this.potatoes=subject.getPotatoes();
            print();
        }
    }
    public void print()
    {
        System.out.println("Fiesta Prices: Carrots- "+this.carrots+" bananas- "+bananas+" potatoes- "+potatoes);
    }
    
}
