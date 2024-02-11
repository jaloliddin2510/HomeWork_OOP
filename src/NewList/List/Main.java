package NewList.List;
public class Main {
    public static void main(String[] args) {
        MobilList<Object> mobilList = new MobilList<>();
        System.out.println(mobilList.getClass().getName());
        mobilList.add(2);
        mobilList.add("Android");
        System.out.println(mobilList.get(0));
        System.out.println(mobilList.get(1));
        System.out.println(mobilList.length());
        System.out.println(mobilList.search(2));
        mobilList.set(0,5);
        System.out.println();
    }
}