package Lesson_28.LoskovSubstitution.Example_1;

public class Main {
    public static void main(String[] args) {
        Animal animal=new Animal();
        System.out.println(animal.eats());
        System.out.println("-------------------------------------------------------------------------------------------");

        Carnivorous carnivorous=new Carnivorous();
        System.out.println(carnivorous.pinTooth());
        System.out.println("-------------------------------------------------------------------------------------------");

        Cat cat=new Cat();
        System.out.println(cat.eats());
        System.out.println(cat.HouseHold());
        System.out.println(cat.pinTooth());
        System.out.println("-------------------------------------------------------------------------------------------");

        Leon leon=new Leon();
        System.out.println(leon.eats());
        System.out.println(leon.Wild());
        System.out.println(leon.pinTooth());
        System.out.println("-------------------------------------------------------------------------------------------");

        Herbivorous herbivorous=new Herbivorous();
        System.out.println(herbivorous.doesNotAttack());
        System.out.println("-------------------------------------------------------------------------------------------");

        Cow cow=new Cow();
        System.out.println(cow.GivesMilk());
        System.out.println(cow.eats());
        System.out.println(cow.doesNotAttack());
        System.out.println("-------------------------------------------------------------------------------------------");

        Giraffe giraffe=new Giraffe();
        System.out.println(giraffe.doesNotAttack());
        System.out.println(giraffe.eats());
        System.out.println(giraffe.LongNeck());

    }
}
