package com.armo;

public class Tesla extends Car {

    public Tesla() {
        super("TeslaEngine", 7, 5, 6);
    }

    @Override
    public void startEngine() {
        System.out.println("Tesla.java: Car engine starts normally with lights and music on");
    }

    @Override
    public void accelerate() {
        System.out.println("Tesla.java: Car is accelerating fast");
    }

    @Override
    public void brake() {
        System.out.println("Tesla.java: Car is braking automatically");
    }
}
