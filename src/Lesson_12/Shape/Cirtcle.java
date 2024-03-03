package Lesson_12.Shape;

public class Cirtcle extends Shape{


    public Cirtcle(double a, double b, double c) {
        super(a, b, c);
    }

    @Override
    public double getPerimetr() {
        return getA()+getB()+getC();
    }

    @Override
    public double getSquare() {
        double p=getPerimetr()/2;
        return Math.sqrt(p*(p-getA())*(p-getB())*(p-getC()));
    }

    @Override
    public double getSideCount() {
        return 3;
    }
}
