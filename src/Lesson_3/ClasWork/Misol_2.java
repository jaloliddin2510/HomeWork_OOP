package Lesson_3.ClasWork;

import java.util.Scanner;

public class Misol_2 {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        String Fasl=in.next();
        String oylar=switch (Fasl){
            case "Bahor" -> "Mart, Apr, May";
            case "Yoz" -> "Iyun, Iyul, Avg";
            case "Kuz" -> "Sen, Okt, Noy";
            case "Qish" -> "Dek, Yan, Feb";
            default -> "bo'sh";

        };
        System.out.println(oylar);
    }
}