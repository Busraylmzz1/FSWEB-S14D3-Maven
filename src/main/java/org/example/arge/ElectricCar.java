package org.example.arge;

public class ElectricCar extends CarSkeleton{
    private double avgKmPerCharge;
    private int  batterySize;
    public ElectricCar( double avgKmPerCharge, int batterySize){

        this.avgKmPerCharge=avgKmPerCharge;
        this.batterySize=batterySize;
    }

    @Override
    public String startEngine() {
        runEngine(this);
        return getName()+ "car starting...";
    }
    @Override
    public String drive() {
        return "run from Electric car";
    }



    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }
}
