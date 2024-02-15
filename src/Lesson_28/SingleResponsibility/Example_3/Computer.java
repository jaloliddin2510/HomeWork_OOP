package Lesson_28.SingleResponsibility.Example_3;

public class Computer {

    private int sizeDisk;
    private String typeDisk;
    public Computer(){}

    public Computer(int sizeDisk, String typeDisk) {
        this.sizeDisk = sizeDisk;
        this.typeDisk = typeDisk;
    }

    public int getSizeDisk() {
        return sizeDisk;
    }

    public String getTypeDisk() {
        return typeDisk;
    }
}
