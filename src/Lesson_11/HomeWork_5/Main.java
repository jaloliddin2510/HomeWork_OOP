package Lesson_11.HomeWork_5;

public class Main {
    public static void main(String[] args) {
        Retangle retangle=new Retangle(2, 3,2,3);
        Circle circle=new Circle(2.5);
        System.out.println("Doiraning uzunligi: "+circle.getPerimetr()+" ga teng");
        System.out.println("Doiraning yuzasi: "+circle.getSquare()+" ga teng");
        System.out.println("Doiraning berilgan o'lchamlar soni: "+circle.getSideCount()+" ta");
        System.out.println("To'rtburchakning perimetri: "+retangle.getPerimetr()+" ga teng");
        System.out.println("To'rtburchakning yuzasi: "+retangle.getSquare()+" ga teng");
        System.out.println("To'rtburchakning berilgan o'lchamlar soni: "+retangle.getSideCount()+" ta");

    }
}
