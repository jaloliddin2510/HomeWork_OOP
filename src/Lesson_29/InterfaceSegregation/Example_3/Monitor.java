package Lesson_29.InterfaceSegregation.Example_3;

public class Monitor implements Lesson_29.InterfaceSegregation.Example_3.Methods_2.Monitor {
    @Override
    public void dateBaseInfo() {
        System.out.println("Barcha malumotlarni chiqarish");
    }

    @Override
    public void print() {
        System.out.println("Belgilangan malumotlarni chiqarish");
    }

    @Override
    public void search() {
        System.out.println("Malumotlar bazasidan malumot qidirish");
    }
}
