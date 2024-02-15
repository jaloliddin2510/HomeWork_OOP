package Lesson_28.SingleResponsibility.Example_1;

public class Customer {
    private int agePerson;
    private String citizenshipPerson;
    private String sexPerson;
    private int stayDayPerson;
    private String withWhom;

    public Customer(int agePerson, String citizenshipPerson, String sexPerson, int stayDayPerson, String withWhom) {
        this.agePerson = agePerson;
        this.citizenshipPerson = citizenshipPerson;
        this.sexPerson = sexPerson;
        this.stayDayPerson = stayDayPerson;
        this.withWhom = withWhom;
    }
}
