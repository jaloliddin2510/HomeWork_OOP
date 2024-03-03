package Lesson_19.HomeWork;

public class Main {
    public static void main(String[] args) {

        Simple simple =new Simple();
        System.out.println("burger: "+simple.sumBurger(Rulon.ODDIY, Meat.ONE_MEAT, Ingredient.NULL)+" so'mlik bo'ldi");
        Healty healty =new Healty();
        System.out.println("burger: "+healty.sumBurger(Rulon.ORTACHA, Meat.TWO_MEAT, Ingredient.SALAT)+" so'mlik bo'ldi");
        Deluxe deluxe=new Deluxe();
        deluxe.menu();
        deluxe.combo1();
        deluxe.combo2();
    }
}
