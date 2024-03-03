package Lesson_8.HomeWork.HardDrive;

import Lesson_8.HomeWork.HardDrive.HardDrive;

public class ResultHard {
    public static void main(String[] args) {
        File mp3=new File("music",10);
        File move=new File("Fas furius",210);
        HardDrive hardDrive=new HardDrive(300);

        System.out.println(hardDrive.write(mp3));
        System.out.println(hardDrive.write(move));
        System.out.println(hardDrive.remove(mp3));
        System.out.println(hardDrive.remove(move));
        System.out.println(hardDrive.isEmpty());
        System.out.println(hardDrive.isFull());
        System.out.println(hardDrive.grtUsedSpase());
        System.out.println(hardDrive.getFreeSapase());
    }
}
