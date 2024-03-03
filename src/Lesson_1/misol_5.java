package Lesson_1;

import java.util.Scanner;

public class misol_5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String soz1=in.nextLine();
        String soz2=in.nextLine();
        int sum=0;
        for (int i = 0; i < soz1.length(); i++) {
            char con=soz1.charAt(i);
            if (con>=65 && con<=90){
                sum++;
            }
        }
        if (sum>0){
            System.out.println("Yo'q");
        }else {
            if (soz1.equalsIgnoreCase(soz2)){
                System.out.println("HA");
            }
        }
    }
}
