package Lesson_29.InterfaceSegregation.Example_1;

public class Main {
    public static void main(String[] args) {
        LinguisticStudent linguisticStudent=new LinguisticStudent();
        linguisticStudent.english();
        linguisticStudent.French();
        linguisticStudent.german();
        linguisticStudent.Russian();
        linguisticStudent.religionHistory();
        linguisticStudent.worldHistory();
        System.out.println("\"");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("\"");
        StudentSpecial studentSpecial=new StudentSpecial();
        studentSpecial.algebra();
        studentSpecial.geometry();
        studentSpecial.mechanicPhysics();
        studentSpecial.practicalPhysics();
        studentSpecial.religionHistory();
        studentSpecial.worldHistory();
        System.out.println("\"");
        System.out.println("-----------------------------------------------------------------------------------------------------------");
    }
}
