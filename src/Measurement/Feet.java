
package Measurement;


public class Feet extends QuantityLength{
    private final double converFactorToBaseQuantity = 30.48;
    
    public Feet(){}
    
    public Feet(double value){
        super(value);
    }
    
    @Override
    public double getConversionFactor(){
        return converFactorToBaseQuantity;
    }
    
    @Override
    public Feet clone(double value){
        return new Feet(value);
    }
}
