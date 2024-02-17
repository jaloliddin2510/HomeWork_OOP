package Lesson_29.InterfaceSegregation.Example_2;

import Lesson_29.InterfaceSegregation.Example_2.Interfaces.Rassom;

public class Rassom_1 implements Rassom {
    @Override
    public void fountainPen() {
        System.out.println("Mo'y qalam kerak");
    }

    @Override
    public void claw() {
        System.out.println("Sifatli bo'yoqlar kerak");
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
        System.out.println("Tinchgina ishlash uchun sharoit kerak");
    }
}
