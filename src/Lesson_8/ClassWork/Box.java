package Lesson_8.ClassWork;

public class Box {
    private Thing thing;
    private int thingSize;
    private int boxSize;

    public Box(Thing thing, int boxSize) {
        this.thing = thing;
        this.boxSize = boxSize;
    }

    public Thing getThing() {
        return thing;
    }

    public void setThing(Thing thing) {
        this.thing = thing;
    }

    public int getVolume() {
        return boxSize;
    }

    public void setVolume(int boxSize) {
        this.boxSize = boxSize;
    }
    public boolean push(Thing thing){
        if ((boxSize-thingSize)<thing.getThingSize()){
            return false;
        }
        thingSize+=thing.getThingSize();
        return thingSize<=boxSize;
    }public boolean isFull(){
        return thingSize==boxSize;
    }
}
