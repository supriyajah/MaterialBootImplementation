package Measurement;

import bootcampday1.Quantity;

public interface Measurable {
    double converToCentimeters();
    public Measurable convertFrom(Measurable quantity);
}
