package Lesson_34;

import Lesson_33.Custom;

public class CustomThread extends Thread {
    private Object locked;
    public CustomThread(Object locked){
        this.locked=locked;
    }

    @Override
    public void run() {
        synchronized (locked){
            for (int i = 0; i < 10; i++) {
                System.out.println(getName()+ " i -> "+i);
            }
        }
    }
}
