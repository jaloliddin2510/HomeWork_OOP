package Lesson_11.HomeWork_5;

public abstract class Shape {
    public double a;
    public double b;
    public double c;

    public double d;

    public Shape(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Shape(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Shape(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Shape(double a) {
        this.a = a;
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

    public double getD() {
        return d;
    }
}
