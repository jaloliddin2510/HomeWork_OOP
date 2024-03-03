package Lesson_2;

import java.util.Scanner;

public class misol_6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str1=in.nextLine();
        String[] mas=str1.split(" ");
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i].length()<min){
                min=mas[i].length();
            }
        }
        System.out.println(min);
    }
}
