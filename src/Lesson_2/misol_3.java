package Lesson_2;

import java.util.Scanner;

public class misol_3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String c=in.next();
        in.nextLine();
        String str1=in.nextLine();
        String str2=in.nextLine();
        String str3="";
        for (int i = 0; i < str1.length(); i++) {
            char con1=c.charAt(0);
            char con2=str1.charAt(i);
            str3=str3.concat(String.valueOf(con2));
            if (con1==con2){
                str3=str3.concat(String.valueOf(str2));
            }
        }
        System.out.println(str3);
    }
}
