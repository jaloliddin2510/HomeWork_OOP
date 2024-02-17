package Lesson_29.InterfaceSegregation.Example_2;

import Lesson_29.InterfaceSegregation.Example_2.Interfaces.Oshpaz;

public class Oshpaz_1 implements Oshpaz {
    @Override
    public void knife() {
        System.out.println("O'tkir va bejirim pichoq kerak");
    }

    @Override
    public void product() {
        System.out.println("Ovqat tayyorlash uchun mahsuot kerak");
    }

    @Override
    public void fire() {
        System.out.println("Ovqatni pishirish uchun olov kerak");
    }

    @Override
    public void eats() {
    }

    @Override
    public void money() {
        System.out.println("Pul kerak");
    }

    @Override
    public void xotirjamIshlashUchunMuhit() {
        System.out.println("Xotirjam i shlash uchun tinch oshxona kerak");
    }
}
