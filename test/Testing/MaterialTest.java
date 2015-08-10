package Testing;


import Measurement.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import bootcampday1.Material;
/**
 *
 * @author Supriya
 */
public class MaterialTest {
    
    public MaterialTest() {
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
    public void testIfMaterialAreEqual(){
        Material measure = new Material();
        Meter meter = new Meter(1);
        Centimeter centimeter = new Centimeter(100);
        assertEquals(true, measure.measureEqual(meter, centimeter));
    }
    
    @Test
    public void testIfMaterialAreNotEqual(){
        Material measure = new Material();
        Meter meter = new Meter(10);
        Centimeter centimeter = new Centimeter(100);
        assertEquals(true, measure.measureEqual(meter, centimeter));
    }
}
