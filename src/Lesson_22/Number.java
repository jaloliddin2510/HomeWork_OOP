package Lesson_22;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        System.out.println(n);
        long x,t=1000_000_000, count = 0;
        String s;
        double y = n % 1;
        long tyin = (long) (y * 100);
        long sum = (long) n;
        while (sum > 0) {
            count++;
            x = sum / t;
            switch ((int) count) {
                case 1 -> s = "milliard ";
                case 2 -> s = "million ";
                case 3 -> s = "ming ";
                default -> s = " ";
            }
            if (x > 0) {
                    long yuz = x / 100;
                    long on = x % 100 / 10;
                    long bir = x % 10;
                    switch ((int) yuz) {
                        case 0 -> System.out.print("");
                        case 1 -> System.out.print("bir yuz ");
                        case 2 -> System.out.print("ikki yuz ");
                        case 3 -> System.out.print("uch yuz ");
                        case 4 -> System.out.print("to'rt yuz ");
                        case 5 -> System.out.print("besh yuz ");
                        case 6 -> System.out.print("olti yuz ");
                        case 7 -> System.out.print("yetti yuz ");
                        case 8 -> System.out.print("sakkiz yuz ");
                        case 9 -> System.out.print("to'qqiz yuz ");
                        default -> System.out.println("ERROR");
                    }
                    switch ((int) on) {
                        case 0 -> System.out.print("");
                        case 1 -> System.out.print("o'n ");
                        case 2 -> System.out.print("yigirma ");
                        case 3 -> System.out.print("o'ttiz ");
                        case 4 -> System.out.print("qirq ");
                        case 5 -> System.out.print("ellik ");
                        case 6 -> System.out.print("oltmish ");
                        case 7 -> System.out.print("yetmish ");
                        case 8 -> System.out.print("sakson ");
                        case 9 -> System.out.print("to'qson ");
                        default -> System.out.println("ERROR");
                    }
                    switch ((int) bir) {
                        case 0 -> System.out.print("");
                        case 1 -> System.out.print("bir " + s);
                        case 2 -> System.out.print("ikki " + s);
                        case 3 -> System.out.print("uch " + s);
                        case 4 -> System.out.print("to'rt " + s);
                        case 5 -> System.out.print("besh " + s);
                        case 6 -> System.out.print("olti " + s);
                        case 7 -> System.out.print("yetti " + s);
                        case 8 -> System.out.print("sakkiz " + s);
                        case 9 -> System.out.print("to'qqiz " + s);
                        default -> System.out.println("ERROR");
                    }
                    sum = sum % t;
                    t = t / 1000;
            }
        }
        System.out.print("so'm ");
        long onlik = tyin / 10;
        long birlik = tyin % 10;
        switch ((int) onlik) {
            case 0 -> System.out.print("nol ");
            case 1 -> System.out.print("o'n ");
            case 2 -> System.out.print("yigirma ");
            case 3 -> System.out.print("o'ttiz ");
            case 4 -> System.out.print("qirq ");
            case 5 -> System.out.print("ellik ");
            case 6 -> System.out.print("oltmish ");
            case 7 -> System.out.print("yetmish ");
            case 8 -> System.out.print("sakson ");
            case 9 -> System.out.print("to'qson ");
        }
        switch ((int) birlik) {
            case 0 -> System.out.print("");
            case 1 -> System.out.print("bir ");
            case 2 -> System.out.print("ikki ");
            case 3 -> System.out.print("uch ");
            case 4 -> System.out.print("to'rt ");
            case 5 -> System.out.print("besh ");
            case 6 -> System.out.print("olti ");
            case 7 -> System.out.print("yetti ");
            case 8 -> System.out.print("sakkiz ");
            case 9 -> System.out.print("to'qqiz ");
        }
        System.out.println("tiyin");
    }
}
