package Lesson_4.HomeWork;

import java.util.Scanner;

public class Misol_3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int[] mas=new int[n];
        int x;
        for (int i = 0; i < n; i++) {
            mas[i]= in.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            if (mas[i]>mas[i+1]){
                x=mas[i+1];
                mas[i+1]=mas[i];
                mas[i]=x;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(mas[i]);
        }
    }
}
