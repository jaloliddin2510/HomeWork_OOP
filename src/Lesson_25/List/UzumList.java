package Lesson_25.List;

import Lesson_25.ParentList;

import java.util.Arrays;
import java.util.Collection;

public class UzumList<T> implements ParentList<T> {
    private Object[] obj;
    private int capasity;
    private int size;
    public UzumList(int capasity){
        this.capasity=capasity;
        obj=new Object[capasity];
    }

    public UzumList(){
        capasity=10;
        obj=new Object[capasity];
    }
    public UzumList(Collection<T> tUzumList){
        add((T) tUzumList);
    }
    public void capasity(){
        if (capasity-size==0){
            capasity=capasity*2;
        }
    }

    public int getCapasity() {
        return capasity;
    }

    @Override
    public int size() {
        int x=0;
        for (Object n :obj) {
            if (n==null){
                continue;
            }
            x++;
        }
        size=x;
        return size;
    }

    @Override
    public boolean contains(T o) {
        for (Object object: obj){
            if (o==object || o.equals(object)) return true;
        }
        return false;
    }

    @Override
    public T[] toArray() {
        size();
        if (obj[0] instanceof Integer){
            Integer[] mas=new Integer[size];
            for (int i = 0; i < size; i++) {
                mas[i]=(Integer) obj[i];
            }
            T[] newMas=(T[])mas;
            return newMas;
        }
        else if (obj[0] instanceof Boolean){
            Boolean[] mas= new Boolean[size];
            for (int i = 0; i < size; i++) {
                mas[i]=(Boolean) obj[i];
            }
            T[] newMas=(T[]) mas;
            return newMas;
        } else if (obj[0] instanceof String) {
            String[] mas=new String[size];
            for (int i = 0; i < size; i++) {
                mas[i]=(String) obj[i];
            }
            T[] mas2=(T[]) mas;
            return mas2;
        }
        else if (obj[0] instanceof  Character){
            Character[] mas=new Character[size];
            for (int i = 0; i < size; i++) {
                mas[i]=(Character) obj[i];
            }
            T[] mas2=(T[]) mas;
            return mas2;
        }
        else if (obj[0] instanceof Double){
            Double[] mas=new Double[size];
            for (int i = 0; i < size; i++) {
                mas[i]=(Double) obj[i];
            }
            T[] mas2=(T[]) mas;
            return mas2;
        }
        else if (obj[0] instanceof Float){
            Float[] mas=new Float[size];
            for (int i = 0; i < size; i++) {
                mas[i]=(Float) obj[i];
            }
            T[] mas2=(T[]) mas;
            return mas2;
        }else return null;
    }

    @Override
    public  Object[] toArrays(){
        size();
        Object[] mas=new Object[size];
        for (int i = 0; i < size; i++) {
            obj[i]=mas[i];
        }
        return mas;
    }
    @Override
    public void add(int index, T element) {
        capasity();
        Object[] objects = new Object[capasity];
        for (int i = 0; i < size(); i++) {
            if (i == index) {
                objects[i++] = element;
            }
            objects[i] = obj[i];
        }
        obj = objects;
        size();
    }
    @Override
    public boolean add(T o) {
        if (o !=null){
            capasity();
            Object[] objects=new Object[capasity];
            int j=0;
            for (int i = 0; i < size(); i++,j++) {
                objects[j]=obj[i];
            }
            objects[j]=o;
            obj=objects;
            return true;
        }

        return false;
    }

    @Override
    public boolean remove(T o) {
        if (o !=null){
            if (contains(o)){
                capasity();
                size();
                Object[] objects=new Object[size-1];
                for (int i = 0; i < size; i++) {
                    if (o==obj[i] || o.equals(obj[i])){
                        continue;
                    }
                    objects[i]=obj[i];
                }
                obj=objects;
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean addAll(UzumList c) {
        try {
            for (int i = 0; i < c.size(); i++) {
                add((T) c.obj[i]);
            }
            return true;
        }catch (ClassCastException s){
            return false;
        }

    }

    @Override
    public T get(int index) {
        if (index>=size()){
            return null;
        }
        if (contains((T) obj[index])){
            T val=(T) obj[index];
            return val;
        }
        return null;
    }

    @Override
    public T set(int index, T element) {
        if (index>=size()){
            return null;
        }
        obj[index]=element;
        return element;
    }
    @Override
    public T remove(int index) {
        if (index>=size()){
            return null;
        }
        size();

        T element=null;
        Object[] objects=new Object[size-1];
        for (int i = 0; i < size; i++) {
            if (i==index){
                element=(T) obj[i];
            }
            objects[i]=obj[i];
        }
        obj=objects;
        return element;
    }
    @Override
    public String toString(){
        Object[] objects=new Object[size()];
        for (int i = 0; i < size(); i++) {
            objects[i]=obj[i];
        }
        return Arrays.toString(objects);
    }
}
