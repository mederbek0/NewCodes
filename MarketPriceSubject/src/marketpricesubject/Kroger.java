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
public class Kroger implements Observer{
    Observable observable;
    private float potatoes;
    private float apple;
    private float onions;
    public Kroger(Observable observable){
        this.observable=observable;
        observable.addObserver(this);
    }
    public void update(Observable obs,Object arg)
    {
        if (obs instanceof Subject)
        {
            Subject subject=(Subject)obs;
            this.apple=subject.getApples();
            this.onions=subject.getOnions();
            this.potatoes=subject.getPotatoes();
            print();
        }
    }
    public void print()
    {
        System.out.println("Kroger Prices: Apple- "+this.apple+" onions- "+onions+" potatoes- "+potatoes);
    }
    
}
