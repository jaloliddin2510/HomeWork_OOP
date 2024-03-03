package Lesson_3;

import java.util.Scanner;

public class misol_3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        char con=str.charAt(0);
        switch (con) {
            case 65, 69, 73, 85, 97, 101, 105, 111, 117 -> System.out.println("Bu unli harf");
        }
    }
}