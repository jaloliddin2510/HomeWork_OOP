package Lesson_12.Computer;

public abstract class Computer {
    String processesModel;
    double diskSize;

    public Computer(String processesModel, double diskSize) {
        this.processesModel = processesModel;
        this.diskSize = diskSize;
    }

    public void showInfo(){
        System.out.println("Kompyuter modeli: "+processesModel);
        System.out.println("Kompyuter xotirasi: "+diskSize+" Gb");
    }

}
