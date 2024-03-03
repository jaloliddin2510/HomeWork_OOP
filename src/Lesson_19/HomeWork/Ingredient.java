package Lesson_19.HomeWork;

public enum Ingredient {

    NULL(0),SALAT(3000), PAMIDOR(5000), SABZI(3000), FREE(6000);
    private int c;
    public int getC() {
        return c;
    }
    Ingredient(int c){
        this.c=c;
    }
}
