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
public class Ounce extends Volume{
    private final double converFactorToBaseQuantity = 6;
    
    public Ounce(){}
    
    public Ounce(double value){
        super(value);
    }
    
    @Override
    public double getConversionFactor(){
        return converFactorToBaseQuantity;
    }
    
    @Override
    public Ounce clone(double value){
        return new Ounce(value);
    }
}
