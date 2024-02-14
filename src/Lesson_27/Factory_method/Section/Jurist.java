package Lesson_27.Factory_method.Section;

import Lesson_27.Factory_method.Duty;

public class Jurist extends Duty {


    public Jurist(String name) {
        super(name);
    }

    @Override
    public String getTodayDuty() {
        return "today the Jurists are on duty";
    }
}
