package Lesson_5;

public class Assistent {
    public static void main(String[] args) {
        int a= -5;
        int b=3;
        double c= 4.6;
        Assistent assistent=new Assistent();
        System.out.println(assistent.addTwoNumber(a,b));
        System.out.println(assistent.pow(a,b));
        System.out.println(assistent.abs(a));
        System.out.println(assistent.getWhoSelection(c));
    }
    public int addTwoNumber(int a, int b){
        return a+b;
    }
    public int pow(int a, int b){
        int x=a;
        for (int i = 0; i < b - 1; i++) {
            a=a*x;
        }
        return a;
    }public int abs(int a){
        return (a>0) ? a : a*(-1);
    }public int getWhoSelection(double a){
        int x;
        x=(int) a;
        return x;
    }
}
