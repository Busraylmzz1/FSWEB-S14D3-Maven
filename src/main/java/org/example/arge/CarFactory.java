package org.example.arge;

public class CarFactory {
    public static void main(String[] args) {
        CarSkeleton electricCar= new ElectricCar("tesla", "tesla desc", 5,6);
        CarSkeleton hybridCar = new HybridCar("ford","ford test",8,5,6);
        CarSkeleton gasPoweredCar = new GasPoweredCar("BMW","BMW TEST",7,9);


    }


}
