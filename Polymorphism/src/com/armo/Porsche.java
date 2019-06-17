package com.armo;

public class Porsche extends Car{

    public Porsche() {
        super("PorscheEngine", 5, 4, 5);
    }

    @Override
    public void startEngine() {
        System.out.println("Porsche.java: Car engine starts normally with lights on");
    }

    @Override
    public void accelerate() {
        System.out.println("Porsche.java: Car is accelerating medium fast");
    }

    @Override
    public void brake() {
        System.out.println("Porsche.java: Car is braking medium fast ");
    }
}
