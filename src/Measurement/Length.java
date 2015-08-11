

package Measurement;


public abstract class Length{
    private double quantityValue;
    
    public Length(){}
    
    public Length(double value){
        this.quantityValue = value;
    }
    
    public double convertToBaseQuantity(){
        return quantityValue*getConversionFactor();
    }
    
     public Length convertFrom(Length quantity){
       return this.clone((quantity.convertToBaseQuantity()/getConversionFactor()));
    }
    public Length addQuantity(Length quantity){
        return this.clone(((quantity.convertToBaseQuantity()+ this.convertToBaseQuantity())/getConversionFactor()));
    }

    
    public abstract double getConversionFactor();
    public boolean equalsTo(Length quantity) {
        return (this.convertToBaseQuantity() == quantity.convertToBaseQuantity());
    }    

    
    public abstract Length clone(double value);
}
