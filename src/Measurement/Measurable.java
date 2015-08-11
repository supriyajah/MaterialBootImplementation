package Measurement;

public interface Measurable {
    double convertToBaseQuantity();
    public Measurable convertFrom(Measurable quantity);
    public Measurable addQuantity(Measurable quantity);
    public boolean equalsTo(Measurable quantity);
}
