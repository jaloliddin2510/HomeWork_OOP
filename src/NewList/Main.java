package NewList;

import NewList.List.UzumList;

public class Main {
    public static void main(String[] args) {
        UzumList<Integer> uzumList=new UzumList<>();
        System.out.println(uzumList.size());
        uzumList.add(25);
        uzumList.add(25);
        uzumList.add(25);
        uzumList.add(25);
        System.out.println(uzumList.size());
        System.out.println(uzumList.getCapasity());
        System.out.println(uzumList.toString());
        UzumList<Object> uzumList1=new UzumList<>();
        uzumList1.addAll(uzumList);
        System.out.println(uzumList1.toString());
    }
}
