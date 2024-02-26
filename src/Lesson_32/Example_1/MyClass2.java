package Lesson_32.Example_1;

public class MyClass2 extends Thread{

    @Override
    public void run() {
        int b=13;
        while (b>0){
            b=b-1;
            System.out.println(Thread.currentThread().getName()+" Hello boys");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
