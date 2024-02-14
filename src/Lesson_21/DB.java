package Lesson_21;

import java.util.ArrayList;
import java.util.List;

public class DB {

    public List<MainData> mediaPlayer =new ArrayList<>();

    public void addData(MainData mainData){

        mediaPlayer.add(mainData);
        System.out.println(mediaPlayer);
    }



    @Override
    public String toString() {
        return "DB{" +
                "mediaPlayer="+"\n"  + mediaPlayer +
                '}';
    }
}
