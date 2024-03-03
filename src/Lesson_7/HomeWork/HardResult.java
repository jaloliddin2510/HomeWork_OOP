package Lesson_7.HomeWork;

public class HardResult {
    public static void main(String[] args) {
        Hard hard=new Hard("(){}");
        System.out.println("Qavslar to'g'ri qo'yilganmi "+hard.bracket("(){}["));
    }
}
