package Lesson_8.ClassWork;

public class ResultRum {
    public static void main(String[] args) {
        Student sanjar=new Student(28,"Sanjar");
        Student anvar=new Student(25,"Anvar");
        Rum rum=new Rum(2);
        System.out.println(rum.addStudent(sanjar));
        System.out.println(rum.addStudent(anvar));
        System.out.println(rum.isEmpty());
        System.out.println(rum.fullRumSize());
    }
}
