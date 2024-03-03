package Lesson_6.HomeWork;

public class PhoneStorage {
    int Storage;
    int busyPart;

    PhoneStorage(int storage, int busyPart) {
        this.Storage=storage;
        this.busyPart=busyPart;
        System.out.println("Jami "+storage+" Gb bo'sh joy mavjud");
        System.out.println("Jami "+busyPart+" Gb band");
    }
    int getEmptyStorage() {
        return Storage-busyPart;
    }

    boolean addMusic(int musicSize) {
        return  (getEmptyStorage()>musicSize);
    }

    boolean addMusics(int musicSize, int count) {
        int allMusics=musicSize*count;
        return allMusics<getEmptyStorage();

    }
}
