package Lesson_14.HomeWork_2;

public class BookShop {
    private String nameBookShop;
    private double sumCapacityBookShop;
    private int[] countBook=new int[]{};
    public int buyBooks(Book book,int countBook){
        return countBook+1;
    }
    public boolean hasBook(){
        return countBook.length>0;
    }

}
