
package Measurement;


public class Inch implements Measurable{
    private double quantityValue;
    private final double conversionFactorToCm = 2.54;
    
    public Inch(){}
    
    public Inch(double value){
        this.quantityValue = value;
    }
    
    @Override
    public double converToCentimeters() {
        return quantityValue*conversionFactorToCm;
    }
    
    @Override
     public Measurable convertFrom(Measurable quantity) {
        return new Inch(quantity.converToCentimeters()/conversionFactorToCm);
     }
}
