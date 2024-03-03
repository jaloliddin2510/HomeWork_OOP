package Lesson_20;

import java.util.ArrayList;
import java.util.List;

public class UserData {
    private String userName;
    private String nikeName;

    public UserData(String userName, String nikeName) {
        this.userName = userName;
        this.nikeName = nikeName;
    }

    public String getNikeName() {
        return nikeName;
    }

    public String getUserName() {
        return userName;
    }
    public void openSocialNetwork(SocialRepository social){

    }
    public void addVideo(VideoData videoData){

    }
    public void addVideos(List<VideoData> playList){

    }
    public void removeVideo(VideoData videoData){

    }
    public void LikeTheVideo(VideoData videoData){

    }
    public void disLikeTheVideo(VideoData videoData){

    }


}
