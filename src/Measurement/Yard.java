
package Measurement;

public class Yard implements Measurable{
    private double quantityValue;
    private final double conversionFactorToCm = 91.44;
    
    public Yard(){}
    
    public Yard(double value){
        this.quantityValue = value;
    }
    
    @Override
    public double converToCentimeters() {
        return quantityValue*conversionFactorToCm;
    }   

    @Override
    public Measurable convertFrom(Measurable quantity) {
        return new Yard(quantity.converToCentimeters()/conversionFactorToCm);
    }
    
    @Override
    public Measurable addQuantity(Measurable quantity) {
        return new Yard((quantity.converToCentimeters()+this.converToCentimeters())/conversionFactorToCm);
    }
}
