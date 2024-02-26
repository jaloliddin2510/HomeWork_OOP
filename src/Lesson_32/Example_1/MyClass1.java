package Lesson_32.Example_1;

public class MyClass1 extends Thread{

    @Override
    public void run() {
        int a=12;
        while (a>0){
            System.out.println((Thread.currentThread().getName()+" Hello guys"));
            a=a-1;
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
