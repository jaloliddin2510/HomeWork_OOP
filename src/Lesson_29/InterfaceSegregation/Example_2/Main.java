package Lesson_29.InterfaceSegregation.Example_2;

import Lesson_29.InterfaceSegregation.Example_2.Interfaces.Oshpaz;
import Lesson_29.InterfaceSegregation.Example_2.Interfaces.Rassom;

public class Main {
    public static void main(String[] args) {
        Oshpaz_1 oshpaz1=new Oshpaz_1();
        oshpaz1.fire();
        oshpaz1.knife();
        oshpaz1.money();
        oshpaz1.product();
        oshpaz1.xotirjamIshlashUchunMuhit();
        System.out.println("\"");
        System.out.println("-----------------------------------------------------------------------------");
        Rassom_1 rassom1=new Rassom_1();
        rassom1.claw();
        rassom1.fountainPen();
        rassom1.eats();
        rassom1.money();
        rassom1.xotirjamIshlashUchunMuhit();
        System.out.println("\"");
        System.out.println("--------------------------------------------------------------------------------");
        Usta_1 usta1= new Usta_1();
        usta1.bandage();
        usta1.bolt();
        usta1.drill();
        usta1.wrap();
        usta1.eats();
        usta1.puttyKnife();

    }
}
