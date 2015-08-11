package Measurement;



public class Centimeter extends Length{
    private final double converFactorToBaseQuantity = 1;
    
    public Centimeter(){}
    
    public Centimeter(double value){
        super(value);
    }
    
    @Override
    public double getConversionFactor(){
        return converFactorToBaseQuantity;
    }
    
    @Override
    public Centimeter clone(double value){
        return new Centimeter(value);
    }

    
}
