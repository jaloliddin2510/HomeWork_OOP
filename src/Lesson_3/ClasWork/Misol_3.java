package Lesson_3.ClasWork;

import java.util.Scanner;

public class Misol_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Ism = in.next();
        int yosh = in.nextInt();
        int a = in.nextInt();
        Yosh(yosh, Ism);
        System.out.println(Oila(a));
    }

    public static void Yosh(int a, String b) {
        System.out.println(b);
        System.out.println(a);
    }

    public static int Oila(int a) {
        return a;
    }
}