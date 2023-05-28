package main.swt6.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface FieldDoc {
    public String author();
    public String description();
    public int id();
    public int version();
}
