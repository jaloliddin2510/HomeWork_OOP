package Lesson_27.Factory_method.Section;

import Lesson_27.Factory_method.Duty;

public class Developer extends Duty {

    public Developer(String name) {
        super(name);
    }

    @Override
    public String getTodayDuty() {
        return "today the Developers are on duty";
    }


}
