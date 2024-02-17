package Lesson_29.InterfaceSegregation.Example_1;

public class StudentSpecial implements Special{
    @Override
    public void religionHistory() {
        System.out.println("Din tarixi fanini o'qishi kerak");
    }

    @Override
    public void worldHistory() {
        System.out.println("Jahon tarixi fanini o'qishi kerak");
    }

    @Override
    public void algebra() {
        System.out.println("algbra fanini o'qishi kerak");
    }

    @Override
    public void geometry() {
        System.out.println("Geometrya fanini o'qishi kerak");
    }


    @Override
    public void mechanicPhysics() {
        System.out.println("nexanik fizikani o'qishi kerak");
    }

    @Override
    public void practicalPhysics() {
        System.out.println("amaliy fizikani o'qishi kerak");
    }
}
