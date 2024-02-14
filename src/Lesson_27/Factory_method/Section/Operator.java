package Lesson_27.Factory_method.Section;

import Lesson_27.Factory_method.Duty;

public class Operator extends Duty {

    public Operator(String name) {
        super(name);
    }

    @Override
    public String getTodayDuty() {
        return "today the operators are on duty";
    }
}
