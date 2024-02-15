package Lesson_28.SingleResponsibility.Example_3;

public class Delete {
    DataDisk dataDisk=new DataDisk();
    public void deleteMedia(Computer computer){
        for (int i = 0; i < dataDisk.computers.size(); i++) {
            if (computer.equals(dataDisk.computers.get(i))){
                dataDisk.computers.remove(i);
            }
        }
    }
}
