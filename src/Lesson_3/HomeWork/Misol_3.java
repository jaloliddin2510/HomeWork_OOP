package Lesson_3.HomeWork;

import java.util.Scanner;

public class Misol_3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String strNew="";
        String strwin="";
        String str2="";
        for (int i = str.length()-1; i >=0; i--) {
            char con=str.charAt(i);
            strNew=strNew.concat(String.valueOf(con));
            strNew=strNew.toLowerCase();
            if (i==str.length()-1) strwin=strwin.concat(String.valueOf(con));
        }
        str2=strwin;
        strwin=strwin.toUpperCase();
        strNew=strNew.replaceFirst(str2,strwin);
        System.out.println(strNew);
    }
}
