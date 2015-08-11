/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing;

import Measurement.Centimeter;
import Measurement.Cup;
import Measurement.QuantityLength;
import Measurement.QuantityVolume;
import Measurement.TableSpoon;
import Measurement.TeaSpoon;
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
        QuantityVolume measurableQuantity_1 = new TableSpoon(1);
        QuantityVolume measurableQuantity_2 = new TeaSpoon(3);
        
        assertEquals(true, measurableQuantity_1.equalsTo(measurableQuantity_2));
    }
    
    @Test
    public void testWhetherCentimeterEqualsCm(){
        QuantityLength quantity_1 = new Centimeter(2);
        QuantityLength quantity_2 = new Centimeter(2);
        
        assertEquals(true, quantity_1.equalsTo(quantity_2));
    }
    
    @Test
    public void testWhetherTbspAddsCupGivesTbsp(){
        QuantityVolume measurableQuantity_1 = new TableSpoon(1);
        QuantityVolume measurableQuantity_2 = new Cup(1);
        
        assertEquals(new TableSpoon(17).convertToBaseQuantity(), measurableQuantity_1.addQuantity(measurableQuantity_2).convertToBaseQuantity(),0.0);
    }
}
