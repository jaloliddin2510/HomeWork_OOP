package Lesson_12.Shape;

public class Main {
    public static void main(String[] args) {
        Rectrangle rectrangle=new Rectrangle(2.5,3.6);
        Cirtcle cirtcle=new Cirtcle(3,4,5);
        System.out.println("Perimetri "+rectrangle.getPerimetr());
        System.out.println("Yuzasi "+rectrangle.getSquare());
        System.out.println("Tomonlar soni "+rectrangle.getSideCount());
        System.out.println("Perimetri "+cirtcle.getPerimetr());
        System.out.println("Yuzasi "+cirtcle.getSquare());
        System.out.println("Tomonlar soni "+cirtcle.getSideCount());
    }
}
