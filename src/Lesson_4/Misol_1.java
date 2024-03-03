package Lesson_4;

import java.util.Scanner;

public class Misol_1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int[] mas=new int[n];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            mas[i]= in.nextInt();
            if (mas[i]>max) max=mas[i];
            if (mas[i]<min) min=mas[i];
        }
        System.out.println(min+ " " +max);
    }
}
