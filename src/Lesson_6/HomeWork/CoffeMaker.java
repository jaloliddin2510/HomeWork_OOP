package Lesson_6.HomeWork;

public class CoffeMaker {
    int water;
    int sugar;
    int coffe;

    CoffeMaker(int water, int sugar, int coffe) {
        this.water = water;
        this.sugar = sugar;
        this.coffe = coffe;
    }

    boolean isMakeCoffees(int oneWater, int oneSugar, int oneCoffe, int count) {
        int a = oneWater * count;
        int b = oneSugar * count;
        int c = oneCoffe * count;
        return a < water && b < sugar && c < coffe;
    }

    void maxCount(int oneWoter, int oneSugar, int oneCoffe) {
        int sum = 0;
        while (water > 0) {
            water = water - oneWoter;
            sum++;
        }
        System.out.println(sum + " ta cofe tayyorlash mumkin");
    }

    private void showInfo(int a) {
        System.out.println(water + " litr sut mavjud");
        System.out.println(sugar + " kg shakar mavjud");
        System.out.println(water + " Gr coffe mavjud");
        if (isMakeCoffees(2, 2, 2, 4) == true) {
            System.out.println("mahsulotlarimiz 4 ta cofe tayyorlashga yetadi");
        }else System.out.println("mahsulotlarimi 4 ta cofe tayyorlashga yetmaydi");

    }
}
