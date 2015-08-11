
package Measurement;

public class Meter implements Measurable{
    private double quantityValue;
    private final double conversionFactorToCm = 100;
    
    public Meter(){}
    
    public Meter(double value){
        this.quantityValue = value;
    }
    
    @Override
    public double converToCentimeters() {
        return quantityValue*conversionFactorToCm;
    }    

    @Override
    public Measurable convertFrom(Measurable quantity) {
        return new Meter(quantity.converToCentimeters()/conversionFactorToCm);
    }
     
    @Override
    public Measurable addQuantity(Measurable quantity) {
        return new Meter((quantity.converToCentimeters()+this.converToCentimeters())/conversionFactorToCm);
    }

}
