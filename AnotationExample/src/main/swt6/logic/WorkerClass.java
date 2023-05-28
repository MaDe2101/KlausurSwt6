package main.swt6.logic;

import main.swt6.annotation.FieldDoc;
import main.swt6.annotation.SimpleDoc;

@SimpleDoc(author = "Marcus Debnar", shortDescription = "This is a hardcore impl of nothing!", version = 8)
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
        this.number = 10;
        this.secondNumber = 20;
    }

    public int getNumber() {
        return number;
    }

}
