package Lesson_1;

import java.util.Scanner;

public class misol_1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str1=in.nextLine();
        String str2=in.nextLine();
        if (str1.equalsIgnoreCase(str2)){
            System.out.println("Bir xil");
        }else {
            System.out.println("Har xil");
        }
    }
}
