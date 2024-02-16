package Lesson_28.OpenClose.Example_2;

public class AverageHotDog implements FastFood{
    @Override
    public String contentFood() {
        return "3 ta qazi, 3 bo'lak pishloq, 3 bo'lak kalbasa, 3 ta sasiska, 3 ta tuxum";
    }

    @Override
    public int cost() {
        return 17_000;
    }
}
