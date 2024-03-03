package Lesson_3.HomeWork;

public class Misol_1 {
    public static void main(String[] args) {
        int summa=0, count=0;
        for (int i = 100; i < 200; i++) {
            if (i%9==0){
                summa+=i;
                count++;
            }
        }
        System.out.println(summa);
        System.out.println(count);
    }
}
