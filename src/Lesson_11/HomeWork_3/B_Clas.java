package Lesson_11.HomeWork_3;

public class B_Clas extends A_Clas{
    public  int age;

    public B_Clas(int age) {
        this.age = age;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
