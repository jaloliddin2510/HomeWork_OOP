package Lesson_7.HomeWork;

public class MathAssist {
    int a;
    int b;
    int c;
    int[] mas;
    double d;
    double e;

    MathAssist(int a, int b) {
        this.a = a;
        this.b = b;
    }

    MathAssist(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    MathAssist(int[] mas) {
        this.mas = mas;
    }

    MathAssist(double a, double b) {
        this.d = a;
        this.e = b;
    }

    int min(int a, int b) {
        if (a > b) return b;
        else return a;
    }

    int min(int a, int b, int c) {
        if (a > c && b > c || a > b && b == c || b > a && a == c) return c;
        else if ((a > b && c > b) || c > a && a == b) return b;
        else return a;
    }

    int min(int[] mass) {
        int x = mass[0];
        for (int i = 1; i < mass.length; i++) {
            if (x > mass[i]) {
                x = mass[i];
            }
        }
        return x;
    }

    int swap(int a, int b) {
        int x=a;
        a=b;
        b=x;
        System.out.println("b="+swap(b));
        return a;
    }
    private int swap(int b){
        return b;
    }

    double swap(double a, double b) {
       double x=a;
       a=b;
       b=a;
        System.out.println("b= "+swap(b));
        return a;
    }private double swap(double b){
        return b;
    }
}
