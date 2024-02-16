package Lesson_28.OpenClose.Example_2;

public class MenuFood {
    public String menuInfo(FastFood fastFood){
        return fastFood.contentFood();
    }
    public int costFood(FastFood fastFood){
        return fastFood.cost();
    }
}
