package Lesson_6.HomeWork;

public class SimilarString {
    char[] chars;
    SimilarString( char[] chars){
        this.chars=chars;
    }
    char[] addCharMassiv(char[] mas){
        String mas1="";
        for (int i = 0; i < chars.length; i++) {
            char con=chars[i];
            mas1=mas1.concat(String.valueOf(con));
        }
        for (int i = 0; i < mas.length; i++) {
            char con=mas[i];
            mas1=mas1.concat(String.valueOf(con));
        }
        int x=mas1.length();
        char[] chars1=new char[mas.length];
        mas1.getChars(0,x,chars1,0);
        return chars1;
    }
}
