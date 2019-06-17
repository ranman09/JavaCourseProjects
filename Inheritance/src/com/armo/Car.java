package com.armo;

public class Car extends Vehicle {
    private int gear;
    private String handSteer;

    public Car(int speed, int gear) {
        super(speed);
        this.gear = gear;
    }

    public int getGear() {
        return gear;
    }

    public String getHandSteer() {
        return handSteer;
    }

    public void changeGear(int gear){
        if (gear <= 4){
            this.gear = gear;
            System.out.println("Changed gear to: " + gear);
        } else {
            System.out.println("Tried changing gear to : " + gear + " Invalid gear");
        }
    }

    public void changeHandSteer(String handSteer){
        this.handSteer = handSteer;
        System.out.println("Changed handsteer to: " + handSteer);
    }




}
