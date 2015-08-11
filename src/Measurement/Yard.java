
package Measurement;

public class Yard extends QuantityLength{
    private final double converFactorToBaseQuantity = 91.44;
    
    public Yard(){}
    
    public Yard(double value){
       super(value);
    }
    
    @Override
    public double getConversionFactor(){
        return converFactorToBaseQuantity;
    }
    
    @Override
    public Yard clone(double value){
        return new Yard(value);
    }
}
