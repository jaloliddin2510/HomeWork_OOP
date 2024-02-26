package Lesson_32.Example_2;

public class Class1 implements Runnable{
    @Override
    public void run() {
        int a=12;
        while (a>0){
            System.out.println((Thread.currentThread().getName()+" Hello guys"));
            System.out.println("-------------------------------------------------------");
            a=a-1;
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
