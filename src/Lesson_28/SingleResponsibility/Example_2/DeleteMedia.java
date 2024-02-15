package Lesson_28.SingleResponsibility.Example_2;

public class DeleteMedia {
    DB db=new DB();

    public void removeMedia(Media media){
        for (int i = 0; i < db.media1.size(); i++) {
            if (media.equals(db.media1.get(i))){
                db.media1.remove(i);
            }
        }
    }
}
