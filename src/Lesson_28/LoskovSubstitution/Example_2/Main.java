package Lesson_28.LoskovSubstitution.Example_2;

public class Main {
    public static void main(String[] args) {
        Shape shape=new Square();
        System.out.println(shape.Area());
        System.out.println(shape.CountDiagonal(10));
        System.out.println(shape.Perimeter());
        System.out.println("--------------------------------------------------------------------------------------------");
        Rectangle rectangle=new Rectangle();
        System.out.println(rectangle.CountParallelSides(90, 90));
        System.out.println(rectangle.Area());
        System.out.println(rectangle.CountDiagonal(4));
        System.out.println(rectangle.Perimeter());
        System.out.println("--------------------------------------------------------------------------------------------");
        Triangle triangle=new Triangle();
        System.out.println(triangle.interiorAngles(60, 60, 60));
        System.out.println(triangle.Area());
        System.out.println(triangle.CountDiagonal(3));
        System.out.println(triangle.Perimeter());
        System.out.println("--------------------------------------------------------------------------------------------");
        Trapezium trapezium=new Trapezium();
        System.out.println(trapezium.median(10,18));
        System.out.println(trapezium.CountParallelSides(60, 30));
        System.out.println(trapezium.Area());
        System.out.println(trapezium.CountDiagonal(4));
        System.out.println(trapezium.Perimeter());
        System.out.println("--------------------------------------------------------------------------------------------");
        RightAngelTriangle rightAngelTriangle=new RightAngelTriangle();
        System.out.println(rightAngelTriangle.hypotenuse(4, 3));
        System.out.println(rightAngelTriangle.interiorAngles(30, 60, 90));
        System.out.println(rightAngelTriangle.Area());
        System.out.println(rightAngelTriangle.CountDiagonal(3));
        System.out.println(rightAngelTriangle.Perimeter());

    }
}
