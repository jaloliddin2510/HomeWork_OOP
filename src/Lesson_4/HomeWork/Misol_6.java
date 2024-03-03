package Lesson_4.HomeWork;

import java.util.Scanner;

public class Misol_6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int son=0;
        int[] mas=new int[n];
        for (int i = 0; i < n; i++) {
            mas[i]= in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (mas[i]<mas[n-1]){
                System.out.println(mas[i]);
                son++;
                break;
            }
        }
        if (son==0){
            System.out.println(son);
        }
    }
}
