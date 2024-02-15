package Lesson_28.SingleResponsibility.Example_2;

public class Search {
    DB dataBase=new DB();
    Media media=new Media();

    public boolean search(String nameVideo){
        for (int i = 0; i < dataBase.media1.size(); i++) {
            if (nameVideo.equals(media.getNameVideo())){
                return true;
            }
        }
        return false;
    }

}
