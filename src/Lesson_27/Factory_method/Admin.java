package Lesson_27.Factory_method;

import Lesson_27.Factory_method.Section.Creditor;
import Lesson_27.Factory_method.Section.Developer;
import Lesson_27.Factory_method.Section.Jurist;
import Lesson_27.Factory_method.Section.Operator;

public class Admin extends TodayDuty{
    @Override
    Duty createDuty(int departament, String name) {
        return switch (departament){
            case 1 -> new Jurist(name);
            case 2 -> new Creditor(name);
            case 3 -> new Developer(name);
            case 4 -> new Operator(name);
            default -> throw new RuntimeException("there is no such section");
        };
    }

}
