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
public class TeaSpoon extends QuantityVolume{
    private final double converFactorToBaseQuantity = 1;
    
    public TeaSpoon(){}
    
    public TeaSpoon(double value){
        super(value);
    }

    @Override
    public double getConversionFactor(){
        return converFactorToBaseQuantity;
    }
    
    @Override
    public TeaSpoon clone(double value){
        return new TeaSpoon(value);
    }
    
}
