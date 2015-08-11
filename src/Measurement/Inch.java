
package Measurement;


public class Inch extends Length{
    private final double converFactorToBaseQuantity = 2.54;
    
    public Inch(){}
    
    public Inch(double value){
        super(value);
    }
    @Override
    public double getConversionFactor(){
        return converFactorToBaseQuantity;
    }
    
    @Override
    public Inch clone(double value){
        return new Inch(value);
    }
}
