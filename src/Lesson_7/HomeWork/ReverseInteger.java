package Lesson_7.HomeWork;

public class ReverseInteger {
    int a;
    ReverseInteger(int a){
        this.a=a;
    }
    void revers(int a){
        int x=0;
        while (a>0){
            x=x*10+a%10;
            a=a/10;
        }
        System.out.println(x);
    }
}
