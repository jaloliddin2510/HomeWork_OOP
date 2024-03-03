package Lesson_14.HomeWork_1;

public class Battery {
    private static final double voltage=1.5;
    private double capacityBattery;
    private int countBattery;
    public Battery(double capacityBattery, int countBattery) {
        this.capacityBattery = capacityBattery;
        this.countBattery = countBattery;
    }

    public int getCountBattery() {
        return countBattery;
    }

    public double getVoltage() {
        return voltage;
    }

    public double getCapacityBattery() {
        return capacityBattery;
    }



}
