package Lesson_27.Factory_method.Section;

import Lesson_27.Factory_method.Duty;

public class Creditor extends Duty {

    public Creditor(String name) {
        super(name);
    }

    @Override
    public String getTodayDuty() {
        return "today the creditors are on duty";
    }
}
