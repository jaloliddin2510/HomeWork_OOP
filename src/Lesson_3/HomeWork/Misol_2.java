package Lesson_3.HomeWork;

import java.util.Scanner;

public class Misol_2 {
    public static void main(String[] args) {
        Scanner in=new Scanner( System.in);
        int a= in.nextInt();
        int x=0,y=0;
        while (a>0){
            x= (int) (x+a%10*Math.pow(2,y));
            y++;
            a=a/10;
        }
        System.out.println(x);
    }
}