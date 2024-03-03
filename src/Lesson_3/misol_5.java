package Lesson_3;

import java.util.Scanner;

public class misol_5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int x, sum=0;
        while (n>0){
            x=n%10;
            n=n/10;
            sum+=x;
        }
        System.out.println(sum);
    }
}
