package Lesson_3;

import java.util.Scanner;

public class misol_6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int x=0;
        while (n>0){
            x=x*10+n%10;
            n=n/10;
        }
        System.out.println(x);
    }
}
