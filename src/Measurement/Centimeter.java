/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Measurement;


public class Centimeter extends Units{
     private final double conversionFactorToCm = 0.01;

    public Centimeter() {
    }  
     
     public Centimeter(double value){
         super(value);
     }
    public double getConversionFactor() {
        return conversionFactorToCm;
    }
    
    public double converToCentimeters() {
        return getValue();
    }
}
