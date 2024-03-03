package Lesson_2;

import java.util.Scanner;

public class misol_8 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        StringBuilder numbersum=new StringBuilder();
        int number=0;
        for (int i = 0; i < str.length(); i++) {
           if (Character.isDigit(str.charAt(i))){
               numbersum.append(str.charAt(i));
           }
           else {
               if (!numbersum.isEmpty()){
                   number+=Integer.parseInt(String.valueOf(numbersum));
                   numbersum.setLength(0);
               }
           }
        }
        System.out.println(number);
    }
}
