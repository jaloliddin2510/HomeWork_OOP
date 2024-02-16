package Lesson_28.LoskovSubstitution.Example_2;

public class Rectangle extends Shape{

    public int CountParallelSides(int interiorAnglesLeft, int interiorAnglesRight){
        if (interiorAnglesLeft == interiorAnglesRight) {
            return 2;
        }
        else if (interiorAnglesLeft+interiorAnglesRight>180){
            return 1;
        }
        else return 0;
    }

}
