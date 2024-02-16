package Lesson_28.OpenClose.Example_1;

public class Main {
    public static void main(String[] args) {
        MemoryManager memoryManager=new MemoryManager();
        System.out.println(memoryManager.MemoryDisk(new Disk_a()));
        System.out.println(memoryManager.MemoryDisk(new Disk_b()));
        System.out.println(memoryManager.MemoryDisk(new Disk_c()));
    }
}
