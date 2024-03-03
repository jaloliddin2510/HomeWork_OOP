package Lesson_11.HomeWork_6;

public class Main {
    public static void main(String[] args) {
        Malibu malibu=new Malibu("Malibu",350,2,75);
        Captiva captiva=new Captiva("Captiva",430,2.3,110);
        System.out.println("To'liq bakning sig'imi: "+malibu.maxCapacity+" ga teng");
        System.out.println("Yoqilg'i istemoli: "+malibu.busyCapacity+" ga teng");
        System.out.println("Qolgan yoqilg'i bilan: "+malibu.maxLongesWay(75)+" km masofa bosib o'ta oladi");
        System.out.println("Benzokalonkadan maksimal: "+malibu.getMaxOilFromRefil(75)+" litr benzin olish mumkin");
    }
}
