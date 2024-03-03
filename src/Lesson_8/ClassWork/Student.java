package Lesson_8.ClassWork;

public class Student {
    private int age;
    private String nameStudent;

    public Student(int age, String nameStudent) {
        this.age = age;
        this.nameStudent = nameStudent;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }
}
