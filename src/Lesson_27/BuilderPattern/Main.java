package Lesson_27.BuilderPattern;

public class Main {
    public static void main(String[] args) {
        Director director=new Director();
        ConcreteHome concreteHome=new ConcreteHome();
        director.createApart(concreteHome,Location.TASHKENT);


        Home home=concreteHome.build();
        System.out.println(home);
    }
}
