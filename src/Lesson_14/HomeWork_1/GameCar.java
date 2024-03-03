package Lesson_14.HomeWork_1;

public class GameCar extends Car{
    Battery battery =new Battery(20,2);

    public GameCar(int slotBattery, double powerEngine) {
        super(slotBattery, powerEngine);
    }
    public boolean run(double time){
        return time<=(battery.getVoltage()*battery.getCapacityBattery())/getPowerEngine();
    }
    public double getBatteryInfo(double time){
        return (getPowerEngine()-(time*getPowerEngine())/(battery.getVoltage()*battery.getCapacityBattery()))/getPowerEngine()*100;
    }
    public boolean addBattery(){
        return battery.getCountBattery()<getSlotBattery();
    }
}
