
package Measurement;


public class Feet implements Measurable{
    private double quantityValue;
    private final double conversionFactorToCm = 30.48;
    
    public Feet(){}
    
    public Feet(double value){
        this.quantityValue = value;
    }
    
    
    
    @Override
    public double converToCentimeters() {
        return quantityValue*conversionFactorToCm;
    } 
    
    @Override
     public Measurable convertFrom(Measurable quantity) {
        return new Feet(quantity.converToCentimeters()/conversionFactorToCm);
    }
     
    @Override
    public Measurable addQuantity(Measurable quantity) {
        return new Feet((quantity.converToCentimeters()+this.converToCentimeters())/conversionFactorToCm);
    }
}
