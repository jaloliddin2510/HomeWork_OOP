package Lesson_27.Factory_method;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Admin admin=new Admin();
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your name! ");
        String name=scanner.nextLine();
        System.out.println("please select one of the sections");
        System.out.println("1 -> Jurist");
        System.out.println("2 -> Creditor");
        System.out.println("3 -> Developer");
        System.out.println("4 -> Operator");
        int section=scanner.nextInt();
        Duty duty= admin.createTodayDuty(section,name);
        System.out.println(duty.getTodayDuty());
        System.out.println(duty.getName());
    }
}
