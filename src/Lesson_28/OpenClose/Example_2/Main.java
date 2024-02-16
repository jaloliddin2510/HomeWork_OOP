package Lesson_28.OpenClose.Example_2;

public class Main {
    public static void main(String[] args) {
        MenuFood menuFood=new MenuFood();
        System.out.println(menuFood.menuInfo(new SimpleHotdog()));
        System.out.println(menuFood.costFood(new SimpleHotdog()));

    }
}
