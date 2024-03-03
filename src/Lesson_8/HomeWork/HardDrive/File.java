package Lesson_8.HomeWork.HardDrive;

public class File {
    private String fileName;
    private int fileVolume;

    public File(String fileName, int fileVolme) {
        this.fileName = fileName;
        this.fileVolume = fileVolme;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getFileVolume() {
        return fileVolume;
    }

    public void setFileVolume(int fileVolume) {
        this.fileVolume = fileVolume;
    }
}
