package Lesson_29.InterfaceSegregation.Example_3;

import Lesson_29.InterfaceSegregation.Example_3.Methods_2.user1;

public class UsersClass implements user1 {
    @Override
    public void login() {
        System.out.println("Tizimga kiring");
    }

    @Override
    public void registration() {
        System.out.println("Tizimda ro'yxatdan o'ting");
    }

    @Override
    public void signIn() {
        System.out.println("Tizimdan chiqing");
    }
}
