package Lesson_2;

import java.util.Scanner;

public class misol_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        for (int i = 0; i < str1.length(); i++) {
            str1 = str1.replaceAll("  ", " ");
        }
        System.out.println(str1);
    }
}
