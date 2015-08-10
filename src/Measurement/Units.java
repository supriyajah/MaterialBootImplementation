/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Measurement;


public class Units implements Measurable{
    private double quantityValue;
    
    public Units(){}
    
    public Units(double quantityValue){
       this.quantityValue = quantityValue; 
    }
    
    public double getValue() {
        return quantityValue;
    }

    @Override
    public double converToCentimeters() {
        
        return quantityValue;
    }
    
}
