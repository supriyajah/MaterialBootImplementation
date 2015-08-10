
package Measurement;

/**
 *
 * @author hp-pc
 */
public class Meter extends Units {

    private final double conversionFactorToCm = 100;
    
    public Meter(){}
    public Meter(double value){
        super(value);
    }
    public double converToCentimeters() {
        return getValue()*conversionFactorToCm;
    }    

}
