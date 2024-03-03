package Lesson_3;

import java.util.Scanner;

public class misol_1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a= in.nextInt();
        int b= in.nextInt();
        int c= in.nextInt();
        int manfiy=0, musbat=0;
        if (a>0){
            musbat++;
        }else manfiy++;
        if (b>0){
            musbat++;
        }else manfiy++;
        if (c>0){
            musbat++;

        }else manfiy++;
        System.out.println("Musbat sonlar "+musbat+" ta");
        System.out.println("Manfiy sonlar "+manfiy+" ta");
    }
}
