package org.example.arge;

public class CarFactory {
    public static void main(String[] args) {
        CarSkeleton electricCar= new ElectricCar(10.5, 7);
        CarSkeleton hybridCar = new HybridCar(40.3, 4,1);
        CarSkeleton gasPoweredCar = new GasPoweredCar(20.3,6);

    }


}
