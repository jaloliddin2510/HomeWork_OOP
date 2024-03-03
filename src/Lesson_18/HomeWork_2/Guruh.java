package Lesson_18.HomeWork_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Guruh {
    public static void main(String[] args) {
        List<String> fudbol1=new ArrayList<>();
        List<String> fudbol=new ArrayList<>();
        fudbol.add("name1");
        fudbol.add("name2");
        fudbol.add("name3");
        fudbol.add("name4");
        fudbol.add("name5");
        fudbol.add("name6");
        fudbol.add("name7");
        fudbol.add("name8");

        fudbol1=fudbol;
        List<String> tennis=new ArrayList<>();
        tennis.add("name2");
        tennis.add("name3");
        tennis.add("name5");
        tennis.add("name8");
        tennis.add("name9");
        tennis.add("name10");
        fudbol1.removeAll(tennis);
        tennis.removeAll(fudbol);

        System.out.println("Guruhda jami: "+(tennis.toArray().length+fudbol.toArray().length)+"ta o'quvchi bor");

        System.out.println("Guruhda faqat fudbolga qatnashadigan o'quvchilar: "+fudbol1);
    }
}
