package Lesson_19.HomeWork;

public class Deluxe extends HamBurger {

    int set1 = Rulon.ORTACHA.getA() + Meat.ONE_MEAT.getB() + Ingredient.PAMIDOR.getC();
    int set2 = Rulon.KATTA.getA() + Meat.TWO_MEAT.getB() + Ingredient.FREE.getC();

    @Override
    int sumBurger(Rulon rulon, Meat meat, Ingredient ingredient) {
        return 0;
    }
    public void menu(){
        System.out.println("combo1 setimiz tarkibida o'rtacha nonli 1 ta katletli va pamidori bor burger bilan birga chips va cola qo'shib berilari! ");
        System.out.println("combo2 setimiz tarkibida katta noni, 2 hissa katlet va free bor. burger bilan birga oddiy burger ham qo'shib beriladi");

    }
    public void combo1() {
            System.out.println(set1 + " so'mlik burger hamda " + Set.CIPS + " bilan " + Set.COLA + " ga ega bo'ldingiz");
    }

    public void combo2() {
        System.out.println(set2+ " so'mlik burger hamda " + Set.SIMPLE_BURGER+ " ga ega bo'ldingiz");
    }
}
