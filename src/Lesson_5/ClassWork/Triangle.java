package Lesson_5.ClassWork;

public class Triangle {
    double a;
    double b;
    double c;
    public double perimeter(){
        return a+b+c;
    }
    public double surface(){
        double p1=(a+b+c)/2;
        double S;
        S=  Math.sqrt(p1*(p1-a)*(p1-b)*(p1-c));
        return S;
    }
}
