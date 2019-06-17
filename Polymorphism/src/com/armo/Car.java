package com.armo;

public class Car {
    private String engineModel;
    private int gears;
    private int wheels;
    private int doors;

    public Car(String engineModel, int gears, int wheels, int doors) {
        this.engineModel = engineModel;
        this.gears = gears;
        this.wheels = wheels;
        this.doors = doors;
    }

    public void startEngine(){
        System.out.println("Car.java: Car engine starts normally");
    }

    public void accelerate(){
        System.out.println("Car.Java: Car is accelerating normally");
    }

    public void brake(){
        System.out.println("Car.Java: Car is braking normally");
    }

    public String getEngineModel() {
        return engineModel;
    }

    public int getGears() {
        return gears;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }
}
