package Testing;


import Measurement.*;

import org.junit.Test;
import static org.junit.Assert.*;
import bootcampday1.Quantity;
/**
 *
 * @author Supriya
 */
public class MaterialTest {
  
//    @Test
//    public void testIfMeterandCmMaterialAreEqual(){
//        Quantity measure = new Quantity();
//        Meter meter = new Meter(1);
//        Centimeter centimeter = new Centimeter(100);
//    
//        assertEquals(true, measure.measureEqual(meter, centimeter));
//    }
//    
//    @Test
//    public void testIfMeterandCmMaterialAreNotEqual(){
//        Quantity measure = new Quantity();
//        Meter meter = new Meter(10);
//        Centimeter centimeter = new Centimeter(100);
//    
//        assertEquals(false, measure.measureEqual(meter, centimeter));
//    }
//    
//    @Test
//    public void testIfFeetAndYardMaterialAreEqual(){
//        Quantity quantity = new Quantity();
//        Feet feet = new Feet(3);
//        Yard yard = new Yard(1);
//    
//        assertEquals(true, quantity.measureEqual(feet, yard));
//    }
//    
//    @Test
//    public void testIfFeetAndYardMaterialAreNotEqual(){
//        Quantity quantity = new Quantity();
//        Feet feet = new Feet(3);
//        Yard yard = new Yard(2);
//    
//        assertEquals(false, quantity.measureEqual(feet, yard));
//    }
//    
//    @Test
//    public void testIfFeetAndInchMaterialAreEqual(){
//        Quantity quantity = new Quantity();
//        Feet feet = new Feet(1);
//        Inch inch = new Inch(12);
//    
//        assertEquals(true, quantity.measureEqual(inch,feet));
//    }
//    
//    @Test
//    public void testIfFeetAndInchMaterialAreNotEqual(){
//        Quantity quantity = new Quantity();
//        Feet feet = new Feet(12);
//        Inch inch = new Inch(1);
//    
//        assertEquals(false, quantity.measureEqual(feet, inch));
//    }
//    
//    @Test
//    public void testIfYardAndInchMaterialAreEqual(){
//        Quantity quantity = new Quantity();
//        Yard yard = new Yard(1);
//        Inch inch = new Inch(36);
//    
//        assertEquals(true, quantity.measureEqual(yard, inch));
//    }
//    
//    @Test
//    public void testIfYardAndInchMaterialAreNotEqual(){
//        Quantity quantity = new Quantity();
//        Yard yard = new Yard(12);
//        Inch inch = new Inch(36);
//    
//        assertEquals(false, quantity.measureEqual(yard, inch));
//    }
//    
//    @Test
//    public void testIfMeterConvertsToCm(){
//        Quantity quantity = new Quantity();
//        Meter meter = new Meter();
//        Centimeter centimeter = new Centimeter(200);
// 
//        assertEquals(true, quantity.measureEqual(quantity.convertTo(centimeter, meter), new Meter(2)));  
//    }
//    
//    @Test
//    public void testIfMeterConvertsToFeet(){
//        Quantity quantity = new Quantity();
//        Feet feet = new Feet();        
//        Meter meter = new Meter(1);
// 
//        assertEquals((new Feet(3.28084)).convertToBaseQuantity(), quantity.convertTo(meter, feet).convertToBaseQuantity(),0.00001);  
//    }
//    
//    @Test
//    public void testIfMeterConvertsToInch(){
//        Quantity quantity = new Quantity();
//        Inch inch = new Inch();        
//        Meter meter = new Meter(1);
// 
//        assertEquals((new Inch(39.3701)).convertToBaseQuantity(), quantity.convertTo(meter, inch).convertToBaseQuantity(),0.0001);  
//    }
//    
//    @Test
//    public void testIfMeterConvertsToYard(){
//        Quantity quantity = new Quantity();
//        Yard yard = new Yard();      
//        Meter meter = new Meter(1);
// 
//        assertEquals((new Yard(1.09361)).convertToBaseQuantity(), quantity.convertTo(meter, yard).convertToBaseQuantity(),0.001);  
//    }
//    
//    @Test
//    public void testIfCmAddsMeterGivesCm(){
//        Quantity quantity = new Quantity();
//        Meter meter = new Meter(1);
//        Centimeter centimeter = new Centimeter(200);
//        
//        assertEquals(new Centimeter(300).convertToBaseQuantity(), quantity.addQuantity(centimeter,meter).convertToBaseQuantity(),0.0);
//    }
//    
//    @Test
//    public void testIfFeetAddsYardGivesFeet(){
//        Quantity quantity = new Quantity();
//        Yard yard = new Yard(1);
//        Feet feet = new Feet(3);
//        
//        assertEquals(new Feet(6).convertToBaseQuantity(), quantity.addQuantity(feet,yard).convertToBaseQuantity(),0.0);
//    }
//    
//    @Test
//    public void testIfInchAddsYardGivesInch(){
//        Quantity quantity = new Quantity();
//        Yard yard = new Yard(1);
//        Inch inch = new Inch(36);
//        
//        assertEquals(new Inch(72).convertToBaseQuantity(), quantity.addQuantity(inch,yard).convertToBaseQuantity(),0.0);
//    }
}
