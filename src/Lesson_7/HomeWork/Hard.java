package Lesson_7.HomeWork;

public class Hard {
    String a;
    Hard(String a){
        this.a=a;
    }
    boolean bracket(String a){
        int count1=0, count2=0, count3=0;
        for (int i = 0; i < a.length(); i++) {
            char con=a.charAt(i);
            if (con==40){
                count1++;
            }
            else if (con==41){
                count1--;
            }else if (con==91){
                count2++;
            }else if (con==93){
                count2--;
            }else if (con==123){
                count3++;
            }else if (con==125){
                count3--;
            }
        }
        return count1==0 && count2==0 && count3==0;
    }

}
