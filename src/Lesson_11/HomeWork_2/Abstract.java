package Lesson_11.HomeWork_2;

public abstract class Abstract {
    public double a;
    public double b;
    public double c;

    public Abstract(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Abstract(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Abstract(double a) {
        this.a = a;
    }

    public abstract double getPerimetr();
    public abstract double getArea();

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
