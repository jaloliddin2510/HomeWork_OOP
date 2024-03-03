package Lesson_2;

import java.util.Scanner;

public class misol_1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String sat1=in.nextLine();
        String str2=in.nextLine();
        String str3;
        str3=str2.replaceAll(sat1,"GITA");
        System.out.println(str3);
    }
}
