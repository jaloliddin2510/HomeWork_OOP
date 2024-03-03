package Lesson_12.Shape;

public abstract class Shape {
    private double a;
    private double b;
    private double c;

    public Shape(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Shape(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public abstract double getPerimetr();

    public abstract double getSquare();

    public abstract double getSideCount();

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
}
