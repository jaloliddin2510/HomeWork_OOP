package Lesson_20;

import java.util.ArrayList;
import java.util.List;

public class PlayList {

    private static PlayList instance = null;
    private List<VideoData> playLists=new ArrayList<VideoData>();
    private PlayList(){
        playLists.add(new VideoData("Muhriddin Xoliqov","player1"));
        playLists.add(new VideoData("Oxunjon Madaliyev","player2"));
        playLists.add(new VideoData("Xurshid Rasulov","player3"));
        playLists.add(new VideoData("Sherali Jo'rayev","player4"));
    }

    public static PlayList getInstance(){
        if (instance==null){
            instance =new PlayList();
        }
        return instance;
    }

}
