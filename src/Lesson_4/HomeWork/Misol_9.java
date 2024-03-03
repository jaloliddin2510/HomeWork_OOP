package Lesson_4.HomeWork;

import java.util.Scanner;

public class Misol_9 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int k= in.nextInt();
        int[] mas=new int[n];
        int sum=0;
        for (int i = 0; i < n; i++) {
            mas[i]= in.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            if (i==k){
                sum++;
            }
            if (sum>0){
                mas[i]=mas[i+1];
            }
        }
        for (int i = 0; i < n - 1; i++) {
            System.out.println(mas[i]);
        }
    }
}
