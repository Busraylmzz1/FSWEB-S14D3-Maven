package org.example.company;

import java.util.Objects;

public class Car {
    private String name;

    private int cylinders;
    private boolean engine;

    private  int wheels;


    public Car (int cylinders, String name){
        this.name= name;
        this.cylinders= cylinders;
        this.engine = Boolean.TRUE; //static olarak aynı olması istediğimiz için default tanımlıyoruz.
        this.wheels = 4; //static olarak aynı olması istediğimiz için default tanımlıyoruz.
    }
    public String accelerate() {
        printSimpleName();
        return "the car is accelerating";
    }
    public  String brake() {
        printSimpleName();
        return "the car is braking";

    }

    public String startEngine (){
        printSimpleName();
        return "the car's engine is starting";
    }
    public void printSimpleName(){
        System.out.println("Class Name:" + getClass().getSimpleName());
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }








    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Car car = (Car) object;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return  Objects.hash(name, cylinders);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", cylinders=" + cylinders +
                ", engine=" + engine +
                ", wheels=" + wheels +
                '}';
    }
}


