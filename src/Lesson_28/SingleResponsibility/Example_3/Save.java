package Lesson_28.SingleResponsibility.Example_3;

public class Save {
    DataDisk dataDisk=new DataDisk();
    public void saveFile(String nameFile, Computer computer){
        System.out.println("Saving to file " + nameFile+" . "+computer);
        dataDisk.computers.add(computer);
    }
    public void saveMusic(String nameMusic, Computer computer){
        dataDisk.computers.add(computer);
        System.out.println("Saving to music "+nameMusic+" . "+computer);
    }
}
