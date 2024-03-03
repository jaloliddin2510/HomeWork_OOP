package Lesson_3.HomeWork;

import java.util.Scanner;

public class Misol_4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String str2=" ";
        int sum=1;
        for (int i = 0; i < str.length(); i++) {
            char con=str.charAt(i);
            char con1=str2.charAt(0);
            if (con==con1){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
