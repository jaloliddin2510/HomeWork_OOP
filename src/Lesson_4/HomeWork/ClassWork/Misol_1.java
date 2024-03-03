package Lesson_4.HomeWork.ClassWork;

import java.util.Random;
import java.util.Arrays;
public class Misol_1 {
    public static void main(String[] args) {
        int arr[] = new int [5];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            int sanoq = 0;
            for(int j = 1; j < arr[i]; j++){
                if(arr[i] % j == 0 && arr[i]!=0){
                    sanoq++;
                }
            }
            if(sanoq == 1){
                System.out.println(arr[i]);
            }
        }

    }
}
