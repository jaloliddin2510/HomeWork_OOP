package Lesson_29.DependencyInvercion.D;

public class Main {
    public static void main(String[] args) {
        Logger fileLogger =new FileLogger();
        User user1=new User(fileLogger);
        user1.toSomething();
        Logger consoleLogger=new ConsoleLogger();
        User user2=new User(consoleLogger);
        user2.toSomething();  
    }
}
