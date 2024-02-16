package Lesson_28.LoskovSubstitution.Example_3;

public class Main {
    public static void main(String[] args) {
        Uzb uzb=new Uzb();
        System.out.println(uzb.Asia());
        System.out.println("-----------------------------------------------------------------------------------------");
        Toshken toshken=new Toshken();
        System.out.println(toshken.Asia());
        System.out.println(toshken.uzb());
        System.out.println("-----------------------------------------------------------------------------------------");
        OlmazorTumani olmazorTumani=new OlmazorTumani();
        System.out.println(olmazorTumani.Asia());
        System.out.println(olmazorTumani.uzb());
        System.out.println(olmazorTumani.tashkent());
        System.out.println("-----------------------------------------------------------------------------------------");
        BeruniyMetro beruniyMetro=new BeruniyMetro();
        System.out.println(beruniyMetro.Asia());
        System.out.println(beruniyMetro.uzb());
        System.out.println(beruniyMetro.tashkent());
        System.out.println(beruniyMetro.olmazor());
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
