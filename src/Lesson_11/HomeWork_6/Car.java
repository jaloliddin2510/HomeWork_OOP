package Lesson_11.HomeWork_6;

public abstract class Car {
    String nameCar;
    double maxCapacity;
    double busyCapacity;
    double qolganYoqilgi;

    public Car(String nameCar, double maxCapacity, double busyCapacity, double qolganYoqilgi) {
        this.nameCar = nameCar;
        this.maxCapacity = maxCapacity;
        this.busyCapacity = busyCapacity;
        this.qolganYoqilgi = qolganYoqilgi;
    }
    public double maxLongesWay(double qolganYoqilgi){
        this.qolganYoqilgi=qolganYoqilgi;
        return qolganYoqilgi/busyCapacity;
    }
    public double getMaxOilFromRefil(double qolganYoqilgi){
        this.qolganYoqilgi=qolganYoqilgi;
        return maxCapacity-qolganYoqilgi;
    }
    public double getMaxCapacity() {
        return maxCapacity;
    }

    public double getBusyCapacity() {
        return busyCapacity;
    }
}
