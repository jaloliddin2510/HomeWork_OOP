package Lesson_6.HomeWork;

public class CoffeMakerResult {
    public static void main(String[] args) {
        CoffeMaker coffeMaker=new CoffeMaker(10,10,10);
        System.out.println("4 ta cofe tayyorlay olamizmi? "+coffeMaker.isMakeCoffees(2, 2, 2, 4));
        System.out.print("nechta coffe tayyorlay olamiz? ");coffeMaker.maxCount(2,2,2);
    }
}
