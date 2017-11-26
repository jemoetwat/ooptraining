package io.mindloops.ooptraining.labtwo;

public class ElectricEngine extends Engine {
    private int batteryPower;

    public ElectricEngine(int horsepower, int batteryPower){
        super(horsepower);
        this.batteryPower = batteryPower;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }
}
