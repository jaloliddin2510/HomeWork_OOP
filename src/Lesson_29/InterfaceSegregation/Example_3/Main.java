package Lesson_29.InterfaceSegregation.Example_3;

public class Main {
    public static void main(String[] args) {
        Monitor monitor=new Monitor();
        monitor.dateBaseInfo();
        monitor.print();
        monitor.search();
        System.out.println("---------------------------------------------------------------");
        Processor processor=new Processor();
        processor.add();
        processor.remove();
        System.out.println("---------------------------------------------------------------------");
        UsersClass usersClass=new UsersClass();
        usersClass.login();
        usersClass.signIn();
        usersClass.registration();
        System.out.println("----------------------------------------------------------------------------------");
    }
}
