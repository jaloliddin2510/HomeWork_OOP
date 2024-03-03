package Lesson_11.HomeWork_2;

public class Treangle extends Abstract{

    public Treangle(int a, int b, int c) {
        super(a, b, c);
    }

    @Override
    public double getPerimetr() {
      return getA()+getB()+getC();
    }

    @Override
    public double getArea() {
        double x=getPerimetr()/2;
        return Math.sqrt(x*(x-getA())*(x-getB())*(x-getC()));
    }
}
