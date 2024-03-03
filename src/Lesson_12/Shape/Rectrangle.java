package Lesson_12.Shape;

public class Rectrangle extends Shape{


    public Rectrangle(double a, double b) {
        super(a, b);
    }

    @Override
    public double getPerimetr() {
        return 2*(getA()+getB());
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
