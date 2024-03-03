package Lesson_7.HomeWork;

public class SimilarResult {
    public static void main(String[] args) {
        char[] con={'a','b','c','1','3','d'};
        SimilarString similarString=new SimilarString(con,"abC13d");
        System.out.println(similarString.equals(con));
        System.out.println(similarString.equals(con, false));
        System.out.println(similarString.subString(3));
        System.out.println(similarString.subString(2, 4));
    }
}
