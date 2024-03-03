package Lesson_8.HomeWork.HardDrive;

public class HardDrive {
    private int hardVolume;
    private int busySpasee;

    public HardDrive(int hardvolume) {
        hardVolume = hardvolume;
    }

    public int gethardVolume() {
        return hardVolume;
    }

    public void sethardVolume(int hardvolume) {
        hardVolume = hardvolume;
    }
    public int write(File file){
        return file.getFileVolume();
    }public int remove(File file){
        busySpasee+= file.getFileVolume();
        return busySpasee;
    }
    public  boolean isEmpty(){
        return  (busySpasee<hardVolume);
    }
    public boolean isFull(){
        return busySpasee==hardVolume;
    }
    public int grtUsedSpase(){
        return busySpasee;
    }
    public int getFreeSapase(){
        return hardVolume-busySpasee;
    }
}
