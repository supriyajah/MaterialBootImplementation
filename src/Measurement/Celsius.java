package Measurement;

public class Celsius extends Temperature{
    public Celsius(){}
    
    public Celsius(double value){
        super(value);
    } 
    
    @Override
    public double convertToBaseQuantity(){
        return 1*quantityValue;
    }

    @Override
    public Temperature convertFrom(Temperature quantity) {
        return new Celsius(quantity.convertToBaseQuantity());
    }
    
    
}
