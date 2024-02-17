package Lesson_29.InterfaceSegregation.Example_1;

public class LinguisticStudent implements Linguistic{
    @Override
    public void religionHistory() {
        System.out.println("Din tarixi fanini o'qishi kerak");
    }

    @Override
    public void worldHistory() {
        System.out.println("jahon tarixi fanini o'qishi kerak");
    }

    @Override
    public void english() {
        System.out.println("Ingliz tilini o'qishi kerak");
    }

    @Override
    public void Russian() {
        System.out.println("Rus tilini o'qishi kerak");
    }

    @Override
    public void French() {
        System.out.println("Fransuz tilini o'qishi kerak");
    }

    @Override
    public void german() {
        System.out.println("Nemis tilini o'qishi kerak");
    }
}
