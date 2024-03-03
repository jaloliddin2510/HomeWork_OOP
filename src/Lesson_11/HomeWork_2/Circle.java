package Lesson_11.HomeWork_2;

public class Circle extends Abstract{

    public Circle(double a) {
        super(a);
    }

    @Override
    public double getPerimetr() {
        return 2*Math.PI*getA();
    }

    @Override
    public double getArea() {
        return getPerimetr()/2*getA();
    }
}
