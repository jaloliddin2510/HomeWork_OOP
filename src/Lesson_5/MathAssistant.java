package Lesson_5;

public class MathAssistant {
    public static void main(String[] args) {
        int number = 5;
        int degree = 3;
        MathAssistant mathAssistant = new MathAssistant();
        System.out.println(mathAssistant.pow(number,degree));
        System.out.println(mathAssistant.sumDigitsNumber(number));
    }

    public int pow(int a, int degree){
        int x=a;
        for (int i = 0; i < degree-1; i++) {
            a*=x;
        }
        return a;
    }
    public int sumDigitsNumber(int number){
        int x=0;
        while (number>0){
            x+=number%10;
            number=number/10;
        }
        return x;
    }
}
