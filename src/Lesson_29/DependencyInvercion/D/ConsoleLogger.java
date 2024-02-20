package Lesson_29.DependencyInvercion.D;

public class ConsoleLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Logging top file "+ message );
    }
}
