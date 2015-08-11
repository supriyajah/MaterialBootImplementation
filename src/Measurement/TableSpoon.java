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
public class TableSpoon extends Volume{
    private final double converFactorToBaseQuantity = 3;
    
    public TableSpoon(){}
    
    public TableSpoon(double value){
       super(value);
    }
    
    @Override
    public double getConversionFactor(){
        return converFactorToBaseQuantity;
    }
    
    @Override
    public TableSpoon clone(double value){
        return new TableSpoon(value);
    }
}
