package NewList.List;

import java.util.ArrayList;

public class MobilList<T> {
    private ArrayList<T> mobilList;
    public MobilList(){
        this.mobilList=new ArrayList<>();
    }
    public T get(int index){
        return mobilList.get(index);
    }
    public void set(int index, T newValue){
         this.mobilList.set(index,newValue);
    }
    public void add(T value){
         this.mobilList.add(value);
    }
    public boolean search(T element){
        return this.mobilList.contains(element);
    }
    public int length(){
        return this.mobilList.size();
    }

}
