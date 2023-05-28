package main.swt6.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface SimpleDoc {
    public String author();
    public String shortDescription();
    public int version() default 1;
}
