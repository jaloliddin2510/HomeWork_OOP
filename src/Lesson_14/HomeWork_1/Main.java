package Lesson_14.HomeWork_1;

public class Main {
    public static void main(String[] args) {
        GameCar gameCar=new GameCar(2,20);
        System.out.println(gameCar.run(10));
        System.out.println(gameCar.addBattery());
        System.out.println(gameCar.getBatteryInfo(30));

    }
}
