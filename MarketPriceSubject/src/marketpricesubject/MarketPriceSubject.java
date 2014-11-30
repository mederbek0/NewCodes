/*
 Design Pattern Observer
learning Design Patterns
 */

package marketpricesubject;
/**
 *
 * @author mederbekbegmatov
 */
public class MarketPriceSubject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Subject subject= new Subject();
        Walmart walmart=new Walmart(subject);
        Kroger kroger=new Kroger(subject);
        Fiesta fiesta =new Fiesta(subject);
        subject.SetPrices((float)12.1, (float)12.0,(float) 3.0,(float) 6.51,(float) 4.12);
        subject.SetPrices((float)0.1, (float)0.0,(float) 0.0,(float) 0.51,(float) 0.12);
        
    }
    
}
