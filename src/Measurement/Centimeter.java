package Measurement;


public class Centimeter implements Measurable{
    private double quantityValue;
    private final double conversionFactorToCm = 1;
    
    public Centimeter(){}
    
    public Centimeter(double value){
        this.quantityValue = value;
    }
    
    @Override
    public double converToCentimeters() {
        return quantityValue*conversionFactorToCm;
    }
    
    @Override
     public Measurable convertFrom(Measurable quantity) {
        return new Centimeter(quantity.converToCentimeters()/conversionFactorToCm);
    }
     
    @Override
     public Measurable addQuantity(Measurable quantity) {
        return new Centimeter((quantity.converToCentimeters()+this.converToCentimeters())/conversionFactorToCm);
    } 
}
