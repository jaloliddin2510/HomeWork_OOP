package Lesson_28.SingleResponsibility.Example_2;

public class Media {

    private String nameVideo;
    private String typeVideo;
    private double capacityVideo;

    public Media(String nameVideo, String typeVideo, double capacityVideo) {
        this.nameVideo=nameVideo;
        this.typeVideo = typeVideo;
        this.capacityVideo = capacityVideo;
    }

    public Media() {
    }

    public String getNameVideo() {
        return nameVideo;
    }

    @Override
    public String toString() {
        return "Media{" +
                "nameVideo='" + nameVideo + '\'' +
                ", typeVideo='" + typeVideo + '\'' +
                ", capacityVideo=" + capacityVideo +
                '}';
    }
}
