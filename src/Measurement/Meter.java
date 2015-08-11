
package Measurement;

public class Meter extends QuantityLength{
    private final double converFactorToBaseQuantity = 100;
    
    public Meter(){}
    
    public Meter(double value){
        super(value);
    }
    
    @Override
    public double getConversionFactor(){
        return converFactorToBaseQuantity;
    }
    
    @Override
    public Meter clone(double value){
        return new Meter(value);
    }
}
