package Lesson_32.Example_2;

public class Main {
    public static void main(String[] args) {
        Thread t1=new Thread(new Class1());
        t1.start();

        Thread t2=new Thread(new Class2());
        t2.start();
    }
}
