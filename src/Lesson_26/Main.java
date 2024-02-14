package Lesson_26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataBase dataBase=DataBase.getInstance();
        System.out.println("Telefon raqamingizni kiriting");
        Scanner scanner=new Scanner(System.in);
        String phoneNumber=scanner.nextLine();
        dataBase.chekUser(phoneNumber);
    }

}
