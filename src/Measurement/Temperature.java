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
public abstract class Temperature {
    protected double quantityValue;
    
    public Temperature(){}
    
    public Temperature(double value){
        this.quantityValue = value;
    }
    
    public boolean equalsTo(Temperature quantity) {
        return (this.convertToBaseQuantity() == quantity.convertToBaseQuantity());
    }
    
    public abstract double convertToBaseQuantity();
    
    public abstract Temperature convertFrom(Temperature quantity);
}
