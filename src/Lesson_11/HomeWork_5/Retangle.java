package Lesson_11.HomeWork_5;

public class Retangle extends  Shape{

    public Retangle(double a, double b, double c, double d) {
        super(a, b, c, d);
    }

    @Override
    public double getPerimetr() {
        return getA()+getB()+getC()+getD();
    }

    @Override
    public double getSquare() {
        return getA()*getB();
    }

    @Override
    public double getSideCount() {
        return 4;
    }
}
