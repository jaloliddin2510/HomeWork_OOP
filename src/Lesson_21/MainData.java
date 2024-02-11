package Lesson_21;

import java.util.ArrayList;
import java.util.List;

public class MainData {
    public UserData userData;
    public List<VideoData> videoData =new ArrayList<>();

    public MainData(UserData userData, List<VideoData> videoData) {
        this.userData = userData;
        this.videoData = videoData;
    }

    @Override
    public String toString() {
        return "MainData{" +
                "userData=" + userData +
                ", videoData=" + videoData +
                '}';
    }
}
