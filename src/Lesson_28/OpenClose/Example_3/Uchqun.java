package Lesson_28.OpenClose.Example_3;

public class Uchqun implements Student {
    @Override
    public int course() {
        return 3;
    }

    @Override
    public String Specialty() {
        return "Axborot tizimlari va texnologiyalari";
    }

    @Override
    public void NameLastName() {
        System.out.println("Usmonov Uchqun");
    }
}
