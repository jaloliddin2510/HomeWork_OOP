package Lesson_32.Example_2;

public class Class2 implements Runnable {

    @Override
    public void run() {
        int a=12;
        while (a>0){
            System.out.println((Thread.currentThread().getName()+" Hello World"));
            a=a-1;
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
