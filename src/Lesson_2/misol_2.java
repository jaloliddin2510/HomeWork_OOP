package Lesson_2;

import java.util.Scanner;

public class misol_2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n1= in.nextInt();
        int n2= in.nextInt();
        in.nextLine();
        String str1=in.nextLine();
        String str2=in.nextLine();
        String str3="";
        for (int i = 0; i < n1; i++) {
            char con=str1.charAt(i);
            str3=str3.concat(String.valueOf(con));
        }
        for (int i = str2.length()-n2; i < str2.length(); i++) {
            char con=str2.charAt(i);
            str3=str3.concat(String.valueOf(con));
        }
        System.out.println(str3);
    }
}
