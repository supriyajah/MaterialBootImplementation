

package Measurement;


public abstract class QuantityLength {
    protected double quantityValue;
    
    public QuantityLength(){}
    
    public QuantityLength(double value){
        this.quantityValue = value;
    }
    
    public double convertToBaseQuantity(){
        return quantityValue*getConversionFactor();
    }
    public QuantityLength convertFrom(QuantityLength quantity){
       return this.clone((quantity.convertToBaseQuantity()/convertToBaseQuantity()));
    }
    public QuantityLength addQuantity(QuantityLength quantity){
        return this.clone(((quantity.convertToBaseQuantity()+ this.convertToBaseQuantity())/getConversionFactor()));
    }
    public double getConversionFactor(){
        return 1;
    }
    public boolean equalsTo(QuantityLength quantity) {
        return (this.convertToBaseQuantity() == quantity.convertToBaseQuantity());
    }    
    public QuantityLength clone(double value){
        return null;
    }
}
