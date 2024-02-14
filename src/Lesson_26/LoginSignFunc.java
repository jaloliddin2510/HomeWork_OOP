package Lesson_26;
@FunctionalInterface
public interface LoginSignFunc<T,U> {
    void notify(T t, U u);
}
