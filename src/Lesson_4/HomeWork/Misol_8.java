package Lesson_4.HomeWork;

import java.util.Scanner;

public class Misol_8 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int[] mas1=new int[n];
        int[] mas2=new int[n];
        for (int i = 0; i < n; i++) {
            mas1[i]= in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (mas1[i]<5){
                mas2[i]=mas1[i]*2;
            }else {
                mas2[i]=mas1[i]/2;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(mas2[i]);
        }
    }
}
