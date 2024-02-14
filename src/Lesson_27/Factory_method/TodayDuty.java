package Lesson_27.Factory_method;

public abstract class TodayDuty {

    abstract Duty createDuty(int section, String name);
    Duty createTodayDuty(int section, String name){
        return createDuty(section,name);
    }
}
