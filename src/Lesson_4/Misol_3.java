package Lesson_4;

public class Misol_3 {
    public static void main(String[] args) {
        int[] mas1= {1 ,2 ,3 ,4 ,5};
        int[] mas2= {2 ,3 ,5 ,4 ,1};
        int[] mas3= {4 ,2 ,3 ,1 ,4};
        int sum1=0,sum2=0,sum3=0;
        for (int i = 0; i < 5; i++) {
             sum1+=mas1[i];
             sum2+=mas2[i];
             sum3+=mas3[i];
        }
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }
}
