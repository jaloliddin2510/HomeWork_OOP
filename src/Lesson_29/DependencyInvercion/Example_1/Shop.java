package Lesson_29.DependencyInvercion.Example_1;

public class Shop {
    private Salary store;

    public void Shop(Salary store){
        this.store=store;
    }
    public void additionalMessage(){
        store.setSalary(12);
    }


}
