package Lesson_7.HomeWork;

public class Car {
    String nameCar;
    int weight;
    int fuelCapacity;
    int brakingDistance;

    public Car(int weight, int fuelCapacity, int brakingDistance, String nameCar){
        this.nameCar=nameCar;
        this.weight=weight;
        this.fuelCapacity=fuelCapacity;
        this.brakingDistance=brakingDistance;
    }
    public void showInfo(){
        System.out.println("Avtomobil nomi: "+nameCar);
        System.out.println("mashina vazni: "+weight+" kg ga teng");
        System.out.println("mashina dvigatel quvvati: "+fuelCapacity+" Ot kuchiga ega");
        System.out.println("mashina "+brakingDistance+" metr masofada 100km/h tezlikga erisha oladi");
    }
}
