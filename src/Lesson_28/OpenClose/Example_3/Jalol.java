package Lesson_28.OpenClose.Example_3;

public class Jalol implements Student{
    @Override
    public int course() {
        return 3;
    }

    @Override
    public String Specialty() {
        return "Axborot tizimi va texnologiyalari";
    }

    @Override
    public void NameLastName() {
        System.out.println("Umirzoqov Jaloliddin");
    }
}
