package Lesson_3.ClasWork;

import java.util.Scanner;

public class Misol_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int continueInt = in.nextInt();
        int breakInt = in.nextInt();
        int sum = 0, x = 0;
        for (int i = 0; i <= n; i++) {
            if (i == continueInt) continue;
            else if (breakInt == i) {
                break;
            }
            sum += i;
        }
        System.out.println(sum);
        sum = 0;
        while (x <= n) {
            x++;
            if (x == continueInt) {
                continue;
            }
            if (x == breakInt) {
                break;
            }
            sum += x;
        }
        System.out.println(sum);
        x = 0;
        sum = 0;
        do {
            x++;
            if (x == continueInt) continue;
            if (x == breakInt) break;
            sum += x;
        } while (x <= n);
        System.out.println(sum);
    }
}
