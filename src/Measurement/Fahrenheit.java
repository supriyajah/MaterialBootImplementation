package Measurement;

public class Fahrenheit extends Temperature{
   public Fahrenheit(){}
    
    public Fahrenheit(double value){
        super(value);
    } 
    
    @Override
    public double convertToBaseQuantity(){
        return (((quantityValue - 32)*5)/9);
    }

    @Override
    public Temperature convertFrom(Temperature quantity) {
        return new Fahrenheit(((quantity.convertToBaseQuantity()*9)/5)+32);
    }
}
