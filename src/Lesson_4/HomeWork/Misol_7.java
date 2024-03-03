package Lesson_4.HomeWork;

import java.util.Scanner;

public class Misol_7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int[] mas=new int[n];
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            mas[i]= in.nextInt();
        }
        for (int i = 0; i < n; i+=2) {
            if (mas[i]<min){
                min=mas[i];
            }
        }
        System.out.println(min);
    }
}
