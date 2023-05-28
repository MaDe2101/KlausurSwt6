package main.swt6.usage;

import main.swt6.annotation.FieldDoc;
import main.swt6.annotation.SimpleDoc;
import main.swt6.logic.WorkerClass;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        getAnnotations();

        WorkerClass workerClass = new WorkerClass();
        WorkerClass vanessasHackler = new WorkerClass(3, 7);
        System.out.println(
                "This is the result of the function: " +      workerClass.f(
                        5,
                        2
                )

        );

        System.out.println(
                "This is the result of the function: " +
                        workerClass.f()
        );

        System.out.println(
                "This is the result of the function: " +
                        vanessasHackler.f()
        );
    }

    private static void getAnnotations() {
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
