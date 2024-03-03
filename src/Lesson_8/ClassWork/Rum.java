package Lesson_8.ClassWork;

public class Rum {
    private int rumSize;
    private int studentSize;

    public Rum(int rumSize) {
        this.rumSize = rumSize;
        studentSize=0;
    }

    public int getRumSize() {
        return rumSize;
    }

    public void setRumSize(int rumSize) {
        this.rumSize = rumSize;
    }
    public boolean addStudent(Student student){
        if (studentSize>=rumSize){
            return false;
        }
        studentSize++;
        return studentSize<=rumSize;
    }
    public boolean isEmpty(){
        return studentSize<rumSize;
    }
    public boolean fullRumSize(){
        return studentSize==rumSize;
    }
}
