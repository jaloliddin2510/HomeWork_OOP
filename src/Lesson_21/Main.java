package Lesson_21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        UserData userData1=new UserData("user1", "m1");
        UserData userData2=new UserData("user2", "m2");
        UserData userData3=new UserData("user3", "m3");
        UserData userData4=new UserData("user4", "m4");
        VideoData videoData1=new VideoData("media1", "mp3");
        VideoData videoData2=new VideoData("media2", "mp4");
        VideoData videoData3=new VideoData("media3", "mp4");
        VideoData videoData4=new VideoData("media4", "mp3");
        List<VideoData> list1= new ArrayList<>();
        list1.add(videoData1);
        List<VideoData> list2=new ArrayList<>();
        list2.add(videoData2);
        List<VideoData> list3 =new ArrayList<>();
        list3.add(videoData3);
        List<VideoData> list4=new ArrayList<>();
        list4.add(videoData4);
        MainData mainData1=new MainData(userData1,list1);
        MainData mainData2=new MainData(userData2,list2);
        MainData mainData3=new MainData(userData3,list3);
        MainData mainData4=new MainData(userData4, list4);
        DB dataBase =new DB();
        dataBase.addData(mainData1);
        dataBase.addData(mainData2);
        dataBase.addData(mainData3);
        dataBase.addData(mainData4);
        dataBase.addData(mainData1);
        dataBase.addData(mainData2);
        dataBase.addData(mainData3);
        dataBase.addData(mainData4);

    }

}
