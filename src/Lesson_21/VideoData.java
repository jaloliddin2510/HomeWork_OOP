package Lesson_21;

public class VideoData {
    private String title;
    private String description;
    private int likeCount=0;
    private int disLikeCount=0;

    public VideoData(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public int getDisLikeCount() {
        return disLikeCount;
    }

    public void setDisLikeCount(int disLikeCount) {
        this.disLikeCount = disLikeCount;
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
