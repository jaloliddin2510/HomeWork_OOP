package Lesson_28.OpenClose.Example_3;

public class Azizbek implements Student {

    @Override
    public int course() {
        return 4;
    }

    @Override
    public String Specialty() {
        return "Elektronika va asbobsozlik";
    }

    @Override
    public void NameLastName() {
        System.out.println("Xudoyorov Azizbek");
    }
}
