package Lesson_35;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class NewFileClass {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\Legion\\Desktop\\JDK_File", "File.java");
        File file0=new File("C:\\Users\\Legion\\Desktop\\JDK_File");
        File  file1=new File(file0, "opened.txt");


        System.out.println(file.getName()+" -> nomi fayl manzili -> "+file.getPath());
        System.out.println(file.getName()+" -> nomli fayling absolut nomi -> "+file.getAbsolutePath());
        System.out.println(file.getName()+" -> nomli fayling bosh manzili -> "+file.getParent());
        System.out.println(file1.getName()+" -> nomli fayl mavjudmi? "+file1.exists());


        File file2=new File("C:\\Users\\Legion\\Desktop\\JDK_File", "rasm.xls");
        File file3=new File("path.py");


        System.out.println(file.renameTo(file3));
        System.out.println(file2.canWrite());
        System.out.println(file2.canRead());
        System.out.println(file.getName());
        String[] str= file.list();
        assert str != null;
        for (String s : str) {
            System.out.println(s);
            File file4=new File("C:\\Users\\Legion\\Desktop\\JDK_File",s);
            System.out.println(file4.getName());
        }
    }
}
