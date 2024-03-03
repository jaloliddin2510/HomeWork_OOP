package Lesson_4.HomeWork;

import java.util.Scanner;

public class Misol_4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int k= in.nextInt();
        int[] mas=new int[n];
        for (int i = 0; i < n; i++) {
            mas[i]= in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(mas[i]+mas[k]);
        }
    }
}
