package com.armo;

public class Vehicle {
    private int speed;

    public Vehicle(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void increaseSpeed(int speed){
        this.speed += speed;
        System.out.println("Speed is increased by: " + speed);
    }

    public void decreaseSpeed(int speed){
        this.speed -= speed;
        System.out.println("Speed is decreased by: " + speed);
    }
}
