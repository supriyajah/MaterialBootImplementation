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
public class Volume {
    private double quantityValue;
    
    public Volume(){}
    
    public Volume(double value){
        this.quantityValue = value;
    }
    
    public double convertToBaseQuantity(){
        return quantityValue*getConversionFactor();
    }
    public Volume convertFrom(Volume quantity){
        return this.clone((quantity.convertToBaseQuantity()/getConversionFactor()));
    }
    public Volume addQuantity(Volume quantity){
        return this.clone(((quantity.convertToBaseQuantity()+ this.convertToBaseQuantity())/getConversionFactor()));
    }
    public boolean equalsTo(Volume quantity){
        return (this.convertToBaseQuantity() == quantity.convertToBaseQuantity());
    }
    public double getConversionFactor(){
        return 1;
    }   
    public Volume clone(double value){
        return null;
    }
}
