package Lesson_5.ClassWork;

public class TriangleResoult {
    public static void main(String[] args) {
        Triangle triangle=new Triangle();
        triangle.a=5;
        triangle.b=6;
        triangle.c=3;
        System.out.println(triangle.perimeter());
        System.out.println(triangle.surface());
    }
}