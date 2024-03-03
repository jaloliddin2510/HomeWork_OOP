package Lesson_11.HomeWork_5;

public class Circle extends Shape{
    public Circle(double a) {
        super(a);
    }

    @Override
    public double getPerimetr() {
        return 2*Math.PI*getA();
    }

    @Override
    public double getSquare() {
        return Math.PI*Math.pow(getA(),2);
    }

    @Override
    public double getSideCount() {
        return 1;
    }
}
