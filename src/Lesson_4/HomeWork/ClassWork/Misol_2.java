package Lesson_4.HomeWork.ClassWork;

import java.util.Scanner;

public class Misol_2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int[] mas=new int[n];
        int[] mas0=new int[n];
        int x, y=0;
        for (int i = 0; i < n; i++) {
            mas[i]= in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            x=0;
            for (int j = 2; j < mas[i]; j++) {
                    if (mas[i]%j==0){
                        x++;
                    }if (x>0) break;
            }
            if (x==0){
                mas0[y]=mas[i];
                y++;
            }
        }
        for (int i = 0; i < y; i++) {
            System.out.print(mas0[i]+" ");
        }
    }
}
