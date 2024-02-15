package Lesson_28.SingleResponsibility.Example_1;

import java.util.ArrayList;

public class Service {

    ArrayList<Customer> customers=new ArrayList<>();

    public void addRoomPerson(Customer customer){
        this.customers.add(customer);
    }

}
