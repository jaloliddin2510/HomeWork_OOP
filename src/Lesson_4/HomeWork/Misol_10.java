package Lesson_4.HomeWork;

import java.util.Scanner;

public class Misol_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] mas = new int[n];
        for (int i = 0; i < n; i++) {
            mas[i] = in.nextInt();
        }
        int x = 0;
        for (int i = 0; i <= n - 1; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                if (i == n - 1) {
                    break;
                }
                if (mas[i] == mas[j]) {
                    x++;
                    break;
                }
            }
        }
        int[] mas1 = new int[n - x];
        int y = 0, k = 0;
        for (int i = 0; i < n; i++) {
            if (y < n - x) {
                for (int j = 0; j <= y; j++) {
                    if (mas1[j] == mas[i]) {
                        k++;
                    }
                    if (k == 0) {
                        mas1[y] = mas[i];
                        y++;
                    }
                }
                k = 0;
            }
        }
        for (int i = 0; i < n - x; i++) {
            System.out.print(mas1[i] + " ");
        }
    }
}