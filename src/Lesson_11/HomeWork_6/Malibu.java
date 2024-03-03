package Lesson_11.HomeWork_6;

public class Malibu extends Car{
    public Malibu(String nameCar, double maxCapacity, double busyCapacity, double qolganYoqilgi) {
        super(nameCar, maxCapacity, busyCapacity, qolganYoqilgi);
    }
    public double maxLongesWay(double qolganYoqilgi){
        this.qolganYoqilgi=qolganYoqilgi;
        return qolganYoqilgi/getBusyCapacity();
    }
    public double getMaxOilFromRefil(double qolganYoqilgi){
        this.qolganYoqilgi=qolganYoqilgi;
        return getMaxCapacity()-qolganYoqilgi;
    }
}
