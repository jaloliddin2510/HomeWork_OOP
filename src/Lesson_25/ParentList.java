package Lesson_25;

import Lesson_25.List.UzumList;

public interface ParentList<T> {
    int size();
    boolean contains(T o);
    T[] toArray();
    Object[] toArrays();
    boolean add(T o);
    boolean remove(T o);
    void add(int index, T element);
    boolean addAll(UzumList<T> c);
    T get(int index);
    T set(int index, T element);
    T remove(int index);

}
