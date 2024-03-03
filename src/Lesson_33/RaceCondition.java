package Lesson_33;

public class RaceCondition {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread1());
        t1.start();
        Thread t2 = new Thread(new MyThread2());
        t2.start();
    }
}