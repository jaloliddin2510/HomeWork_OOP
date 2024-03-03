package Lesson_6.HomeWork;

public class PhoneStorageResult {
    public static void main(String[] args) {
        PhoneStorage phoneStorage=new PhoneStorage(64, 32);
        phoneStorage.getEmptyStorage();
        System.out.println("2 Gb lik musiqa qo'sha olamanmi: "+ phoneStorage.addMusic(2));
        System.out.println("4 Gb lik 10 ta musiqa qo'shish mumkinmi: "+ phoneStorage.addMusics(4, 10));
    }
}
