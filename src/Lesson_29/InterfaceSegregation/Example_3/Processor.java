package Lesson_29.InterfaceSegregation.Example_3;

public class Processor implements Lesson_29.InterfaceSegregation.Example_3.Methods_2.Processor {
    @Override
    public void add() {
        System.out.println("Malumot qo'shish");
    }

    @Override
    public void remove() {
        System.out.println("Malumotlarni o'shirish");
    }
}
