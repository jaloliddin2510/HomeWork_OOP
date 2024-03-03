package Lesson_19.Burger;

import java.util.ArrayList;
import java.util.List;

public class DB {

    private static DB instance=null;

    List<Burger> burgers=new ArrayList<>();
    private DB(){
        boolean add = burgers.add(new ProductSimple(ProductSimple.MEET, 15, 10_000));
    }
    public static DB getInstance(){
        if (instance==null){
            instance=new DB();
        }
        return instance;
    }

}
