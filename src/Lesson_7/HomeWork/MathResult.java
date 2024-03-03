package Lesson_7.HomeWork;
public class MathResult {
    public static void main(String[] args) {
        MathAssist mathAsisst=new MathAssist(3,4);
        System.out.println(mathAsisst.min(3, 4));
        System.out.println(mathAsisst.min(4, 5, 6));
        int[] a = {1,2,3,4,5};
        System.out.println(mathAsisst.min(a));
        System.out.println((mathAsisst.swap(3, 4)));
        System.out.println((mathAsisst.swap(2.3, 4.1)));
    }
}
