package Lesson_4.HomeWork;

import java.util.Scanner;

public class Misol_2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int[] mas=new int[n];
        int sum=0, x;
        for (int i = 0; i < n; i++) {
            mas[i]= in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (mas[i]%2==0){
                sum++;
            }
        }
        int[] mas1=new int[sum];
        sum=0;
        for (int i = 0; i < n; i++) {
            if (mas[i]%2==0){
                mas1[sum]=i;
                sum++;
            }
        }
        for (int i = 0; i < sum - 1; i++) {
            if (mas1[i]>mas1[i+1]){
                x=mas1[i+1];
                mas1[i+1]=mas1[i];
                mas1[i]=x;
            }
        }
        for (int i = sum-1; i >=0; i--) {
            System.out.println(mas1[i]);
        }
    }
}
