package main.swt6.logic;

import main.swt6.annotation.CalculationAnnotation;
import main.swt6.annotation.FieldDoc;
import main.swt6.annotation.SimpleDoc;

@SimpleDoc(author = "Marcus Debnar", shortDescription = "This is a hardcore impl of nothing!", version = 8)
@CalculationAnnotation(numberOne = 5, numberTwo = 2)
public class WorkerClass {

    @FieldDoc(id = 1, author = "Marcus Debnar", description = "This is the number in the Class.", version = 1)
    int number;

     @FieldDoc(id = 2, author = "Vanessa Oppenauer", description = "Hello itse me vanse!", version = 1)
     int secondNumber;

    public WorkerClass(int number, int secondNumber) {
        this.number = number;
        this.secondNumber = secondNumber;
    }

    public WorkerClass() {
        if(WorkerClass.class.getAnnotation(CalculationAnnotation.class) != null){
            this.number = WorkerClass.class.getAnnotation(CalculationAnnotation.class).numberOne();
            this.secondNumber = WorkerClass.class.getAnnotation(CalculationAnnotation.class).numberTwo();
        } else {
            this.number = 5;
            this.secondNumber = 3;
        }
    }

    public int getNumber() {
        return number;
    }

    public int f(int x, int y){
        return (x + y) * 2;
    }

    public int f(){
        return (number + secondNumber) * 2;
    }
}
