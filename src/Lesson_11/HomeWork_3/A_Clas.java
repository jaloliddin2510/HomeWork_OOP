package Lesson_11.HomeWork_3;

import java.util.Objects;

public abstract class A_Clas {
    public abstract int getAge();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A_Clas aClas = (A_Clas) o;
        return getAge() == aClas.getAge();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge());
    }
}
