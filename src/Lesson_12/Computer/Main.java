package Lesson_12.Computer;
public class Main {
    public static void main(String[] args) {
        Acer acer=new Acer("Acer", 512);
        HP hp=new HP("Hp", 256);
        MSI msi=new MSI("Msi",512);
        acer.showInfo();
        hp.showInfo();
        msi.showInfo();
    }
}