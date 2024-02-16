package Lesson_28.OpenClose.Example_2;

public class BigHotDog implements FastFood{
    @Override
    public String contentFood() {
        return "6 ta qazi, 6 bo'lak pishloq, 6 bo'lak kalbasa, 6 ta sasiska, 6 ta tuxum";
    }

    @Override
    public int cost() {
        return 22_000;
    }
}
