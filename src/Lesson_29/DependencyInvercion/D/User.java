package Lesson_29.DependencyInvercion.D;

public class User {
    private Logger logger;
    public User(Logger logger){
        this.logger=logger;
    }
    public void toSomething(){
        logger.log("Something happened too User class. ");
    }
}
