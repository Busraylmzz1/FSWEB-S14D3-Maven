package org.example.company;

import java.util.Objects;

public class Car {
    private String name;
    private int cylinders;
    private boolean engine;
    private int wheels;

    public Car(int cylinders, String name){
        this.cylinders=cylinders;
        this.name= name;
        this.engine= Boolean.TRUE;
        this.wheels= 4;
    }
    public String getName(){
        return name;
    }
    public int getCylinders(){
        return cylinders;
    }
    public String accelerate(){
        System.out.println("Class Name:" +getClass().getSimpleName() );
        return "the car is accelerating";
    }

    public  String startEngine(){
        System.out.println("Class Name:" +getClass().getSimpleName() );
        return "the car's engine is starting";
    }
    public String brake(){
        System.out.println("Class Name:" +getClass().getSimpleName() );
        return "the car is braking";

    }


    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Car car = (Car) object;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cylinders);
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
