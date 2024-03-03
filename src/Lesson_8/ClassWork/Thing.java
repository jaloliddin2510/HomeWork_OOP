package Lesson_8.ClassWork;

public class Thing {

    String nameThing;
    int thingSize;

    public Thing(String nameThing, int thingSize) {
        this.nameThing = nameThing;
        this.thingSize = thingSize;
    }

    public String getNameThing() {
        return nameThing;
    }

    public void setNameThing(String nameThing) {
        this.nameThing = nameThing;
    }

    public int getThingSize() {
        return thingSize;
    }

    public void setThingSize(int thingSize) {
        this.thingSize = thingSize;
    }
}
