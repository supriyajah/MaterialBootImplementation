/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing;

import Measurement.Centimeter;
import Measurement.Cup;
import Measurement.Celsius;
import Measurement.Fahrenheit;
import Measurement.Length;
import Measurement.Volume;
import Measurement.TableSpoon;
import Measurement.TeaSpoon;
import Measurement.Temperature;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author hp-pc
 */
public class MaterialTestExtended {
    
    public MaterialTestExtended() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testWhetherTbspEqualsToTsp(){
        Volume measurableQuantity_1 = new TableSpoon(1);
        Volume measurableQuantity_2 = new TeaSpoon(3);
        
        assertEquals(true, measurableQuantity_1.equalsTo(measurableQuantity_2));
    }
    
    @Test
    public void testWhetherCentimeterEqualsCm(){
        Length quantity_1 = new Centimeter(2);
        Length quantity_2 = new Centimeter(2);
        
        assertEquals(true, quantity_1.equalsTo(quantity_2));
    }
    
    @Test
    public void testWhetherTbspAddsCupGivesTbsp(){
        Volume measurableQuantity_1 = new TableSpoon(1);
        Volume measurableQuantity_2 = new Cup(1);
        
        assertEquals(new TableSpoon(17).convertToBaseQuantity(), measurableQuantity_1.addQuantity(measurableQuantity_2).convertToBaseQuantity(),0.0);
    }
    
    @Test
    public void testWhetherFEqualsDegree(){
        Temperature measurableQuantity_1 = new Fahrenheit(32);
        Temperature measurableQuantity_2 = new Celsius(0);
        
        assertEquals(true, measurableQuantity_1.equalsTo(measurableQuantity_2));
    }
    
    @Test
    public void testWhetherFConvertsToCelsius(){
        Temperature measurableQuantity_1 = new Fahrenheit(32);
        Temperature measurableQuantity_2 = new Celsius();
        Temperature measurableQuantity_3 = measurableQuantity_2.convertFrom(measurableQuantity_1);
        
        assertEquals(true, measurableQuantity_3.equalsTo(new Celsius(0)));
        
    }
}
