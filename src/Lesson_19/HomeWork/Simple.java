package Lesson_19.HomeWork;

public class Simple extends HamBurger{

    @Override
    int sumBurger(Rulon rulon, Meat meat, Ingredient ingredient) {
        return rulon.getA()+meat.getB();
    }
}
