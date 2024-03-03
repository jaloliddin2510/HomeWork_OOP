package Lesson_3;

import java.util.Scanner;

public class misol_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        String kasb = switch (a) {
            case 1 -> "Development";
            case 2 -> "Frontent";
            case 3 -> "backent";

            case 4 -> "Grafick";
            case 5 -> "Mobilograf";
            default -> "Bunaqa kasb bizning ro'yxatimizda yo'q";
        };
        System.out.println(kasb);
    }
}
