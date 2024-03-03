package Lesson_20;

public class VideoData {
    private String title;
    private String description;
    private int likeCount;
    private int disLikeCount;

    public VideoData(String title, String description, int likeCount, int disLikeCount) {
        this.title = title;
        this.description = description;
        this.likeCount = likeCount;
        this.disLikeCount = disLikeCount;
    }

    public VideoData(String title, String description) {
        this.title = title;
        this.description = description;
    }

    @Override
    public String toString() {
        return "VideoData{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", likeCount=" + likeCount +
                ", disLikeCount=" + disLikeCount +
                '}';
    }

}
