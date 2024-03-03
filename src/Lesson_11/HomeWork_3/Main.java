package Lesson_11.HomeWork_3;

public class Main {
    public static void main(String[] args) {
        B_Clas b_clas=new B_Clas(23);
        B_Clas b_clas1=new B_Clas(23);
        System.out.println(b_clas.equals(b_clas1));
        System.out.println(b_clas.hashCode());
        System.out.println(b_clas1.hashCode());
    }
}
