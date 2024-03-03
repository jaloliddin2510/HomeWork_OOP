package Lesson_2;

import java.util.Scanner;

public class misol_4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str1=in.nextLine();
        String str2=in.nextLine();
        String str3=in.nextLine();
        String con="";
        String[] mas=str1.split(" ");
        for (int i = 0; i < mas.length; i++) {
            if (mas[i].equalsIgnoreCase(str2)){
                mas[i]=str3;
            }
        }
        for (int i = 0; i < mas.length; i++) {
            con=con.concat(String.valueOf(mas[i]));
            if (i<mas.length-1){
                con=con.concat(" ");
            }
        }
        System.out.println(con);
    }
}
