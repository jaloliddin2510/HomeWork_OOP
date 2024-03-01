package Lesson_33;

public class MyThread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Custom.setA(Custom.getA()+1);
            System.out.println(Thread.currentThread().getName()+" i -> "+Custom.getA());
        }
    }
}
