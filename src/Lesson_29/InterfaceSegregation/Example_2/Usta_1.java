package Lesson_29.InterfaceSegregation.Example_2;

import Lesson_29.InterfaceSegregation.Example_2.Interfaces.Usta;

public class Usta_1 implements Usta {
    @Override
    public void bandage() {
        System.out.println("Arra kerak");
    }

    @Override
    public void bolt() {
        System.out.println("Bolta kerak");
    }

    @Override
    public void wrap() {
        System.out.println("Mix kerak");
    }

    @Override
    public void puttyKnife() {
        System.out.println("Devor tamirlash uchun shpatel kerak");
    }

    @Override
    public void drill() {
        System.out.println("drel kerak");
    }

    @Override
    public void eats() {
        System.out.println("Ovqat kerak");
    }

    @Override
    public void money() {
        System.out.println("Pul kerak");
    }

    @Override
    public void xotirjamIshlashUchunMuhit() {
        System.out.println("Tinchlik kerak");
    }
}
