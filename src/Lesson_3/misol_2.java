package Lesson_3;

import java.util.Scanner;

public class misol_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String soz = in.nextLine();
        int unli = 0, undosh = 0;
        for (int i = 0; i < soz.length(); i++) {
            char con = soz.charAt(i);
            if (con >= 65 && con <= 90 || con >= 97 && con <= 122) {
                if (con == 65 || con == 69 || con == 73 || con == 85 || con == 97 || con == 101 || con == 105 || con == 111 || con == 117) {
                    unli++;
                } else {
                    undosh++;
                }
            }
        }
        System.out.println("Undosh sonlar "+undosh+" ta");
        System.out.println("Unli sonlar "+unli+" ta");
    }
}
