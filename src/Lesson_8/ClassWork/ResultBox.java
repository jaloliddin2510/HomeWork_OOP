package Lesson_8.ClassWork;

import Lesson_8.ClassWork.Box;

public class ResultBox {
    public static void main(String[] args) {
        Thing cola=new Thing("Cola",4);
        Thing fanta=new Thing("Fanta",6);
        Box  box=new Box(cola,10);
        System.out.println(box.push(cola));
        System.out.println(box.push(fanta));
        System.out.println(box.isFull());
    }
}
