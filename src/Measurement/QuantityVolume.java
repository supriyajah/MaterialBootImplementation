/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Measurement;

/**
 *
 * @author hp-pc
 */
public class QuantityVolume {
     protected double quantityValue;
    
    public QuantityVolume(){}
    
    public QuantityVolume(double value){
        this.quantityValue = value;
    }
    
    public double convertToBaseQuantity(){
        return quantityValue*getConversionFactor();
    }
    public QuantityVolume convertFrom(QuantityVolume quantity){
        return this.clone((quantity.convertToBaseQuantity()/convertToBaseQuantity()));
    }
    public QuantityVolume addQuantity(QuantityVolume quantity){
        return this.clone(((quantity.convertToBaseQuantity()+ this.convertToBaseQuantity())/getConversionFactor()));
    }
    public boolean equalsTo(QuantityVolume quantity){
        return (this.convertToBaseQuantity() == quantity.convertToBaseQuantity());
    }
    public double getConversionFactor(){
        return 1;
    }   
    public QuantityVolume clone(double value){
        return null;
    }
}
