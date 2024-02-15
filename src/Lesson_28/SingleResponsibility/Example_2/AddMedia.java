package Lesson_28.SingleResponsibility.Example_2;

import java.util.ArrayList;

public class AddMedia {
    DB db=new DB();
    public void addMedia(Media media){
        db.media1.add(media);
    }
}
