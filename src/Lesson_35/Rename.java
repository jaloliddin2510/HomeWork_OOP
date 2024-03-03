package Lesson_35;

import java.io.File;
import java.io.IOException;

public class Rename {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\Legion\\Desktop\\JDK_File", "Print.java");


        File file1=new File("C:\\Users\\Legion\\Desktop\\JDK_File","Filess.txt");
        System.out.println(file.renameTo(file));
        System.out.println(file.getName());
        System.out.println(file1);
        System.out.println(file1.delete());
        file1.deleteOnExit();
        System.out.println(file.delete());
        file.deleteOnExit();
    }
}
