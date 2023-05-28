package main.swt6.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface CalculationAnnotation {
    public int numberOne();
    public int numberTwo();
}
