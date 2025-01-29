package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description){
        this.name= name;
        this.description= description;
    }
    public CarSkeleton(){

    }

    public String startEngine(){
        return startEngine();
    }

    public String drive(){
        return drive();
    }

    protected String runEngine(){
        return runEngine();
    }

}
