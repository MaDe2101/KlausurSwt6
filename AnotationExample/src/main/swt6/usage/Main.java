package main.swt6.usage;

import main.swt6.annotation.FieldDoc;
import main.swt6.annotation.SimpleDoc;
import main.swt6.logic.WorkerClass;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        System.out.println("Annotation of class WorkerClass:");
        System.out.println("Author: " + WorkerClass.class.getAnnotation(SimpleDoc.class).author());
        System.out.println("Short Description: " + WorkerClass.class.getAnnotation(SimpleDoc.class).shortDescription());
        System.out.println("Version: " + WorkerClass.class.getAnnotation(SimpleDoc.class).version());

        for (Field f : WorkerClass.class.getDeclaredFields()) {
            System.out.println("This is the field: " + f.getName());
            FieldDoc doc = f.getAnnotation(FieldDoc.class);

            if (doc != null) {
                System.out.println("Author: " + doc.author());
                System.out.println("Description: " + doc.description());
                System.out.println("ID: " + doc.id());
                System.out.println("Version: " + doc.version());
            }
        }
    }
}
