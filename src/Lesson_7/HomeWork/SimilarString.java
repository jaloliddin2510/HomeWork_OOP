package Lesson_7.HomeWork;

public class SimilarString {
    char[] chars;
    String s;
    public SimilarString(char[] chars,String s){
        this.chars=chars;
        this.s=s;
    }
    boolean equals(char[] mass){
        int sum=0;
        for (int i = 0; i < chars.length; i++) {
            char con=s.charAt(i);
            if (con==chars[i]){
                sum++;
            }
        }
        return sum== chars.length;
    }
    boolean equals(char[] mas, boolean ignoreCase){
        int sum=0;
        for (int i = 0; i < chars.length; i++) {
            char con=s.charAt(i);
            char con1=chars[i];
            if (con>=65 && con<=90 && con1>=65 && con1<=90 || (con>=97 && con<=122 && con1>=97 && con1<=122)){
                if (con==con1){
                    sum++;
                }
            }else if (con>=65 && con<=90 && con1>=97 && con1<=122){
                if (con==con1-32){
                    sum++;
                }
            }else if (con>=97 && con<=122 && con1>=65 && con1<=90){
                if (con-32==con1){
                    sum++;
                }
            }
        }
        return sum==chars.length;
    }
    char[] subString(int startIndex){
        int count=0;
        char[] mas=new char[chars.length-startIndex];
        for (int i = startIndex; i < chars.length; i++) {
            mas[count]=chars[i];
            count++;
        }
        return mas;
    }
    char[] subString(int startIndex, int endIndex){
        int x=0;
        char[] mass=new char[endIndex-startIndex];
        for (int i = startIndex; i < endIndex; i++) {
            mass[x]=chars[i];
            x++;
        }
        return mass;
    }
}
