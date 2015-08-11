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
public class Cup extends Volume{
    private final double converFactorToBaseQuantity = 48;
    
    public Cup(){}
    
    public Cup(double value){
        super(value);
    }
    
    @Override
    public double getConversionFactor(){
        return converFactorToBaseQuantity;
    }
    
    @Override
    public Cup clone(double value){
        return new Cup(value);
    }
    
}
