
package bootcampday1;
import Measurement.Measurable;


public class Quantity {
    
    public boolean measureEqual(Measurable quantity_1,Measurable quantity_2){
        return (quantity_1.converToCentimeters() == quantity_2.converToCentimeters());
    }
    
    public Measurable convertTo(Measurable quantity_1,Measurable quantity_2){
        return quantity_2.convertFrom(quantity_1);        
    }
    
    public Measurable addQuantity(Measurable quantity_1,Measurable quantity_2) {
        return quantity_1.addQuantity(quantity_2);
    }

}
