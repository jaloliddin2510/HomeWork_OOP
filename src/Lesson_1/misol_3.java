package Lesson_1;

import java.util.Scanner;

public class misol_3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String soz=in.nextLine();
        int sum=0;
        for (int i = 0; i < soz.length(); i++) {
            char con=soz.charAt(i);
            switch (con) {
                case 65, 69, 73, 79, 85, 97, 101, 105, 111, 117 -> sum++;
            }
        }
        System.out.println(sum);
    }
}
