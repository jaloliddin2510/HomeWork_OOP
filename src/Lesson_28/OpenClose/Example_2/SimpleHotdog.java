package Lesson_28.OpenClose.Example_2;

public class SimpleHotdog implements FastFood{
    @Override
    public String contentFood() {
        return "2 ta qazi, 2 bo'lak pishloq, 2 bo'lak kalbasa, 2 ta sasiska, 2 ta tuxum";
    }

    @Override
    public int cost() {
        return 15_000;
    }
}
