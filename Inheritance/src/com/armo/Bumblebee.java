package com.armo;

public class Bumblebee extends Car{
    private boolean isSwordOn;
    private int gear;

    public Bumblebee(int gear, boolean isSwordOn) {
        super(300, gear);
        this.isSwordOn = isSwordOn;
    }

    @Override
    public void changeGear(int gear) {
        if (gear <= 5){
            this.gear = gear;
            System.out.println("Changed gear to: " + gear);
        } else {
            System.out.println("Invalid gear");
        }
    }

    public void turnOnSword(boolean isSwordOn){
        this.isSwordOn = isSwordOn;
        System.out.println("Changed sword to: " + isSwordOn);
    }

    public boolean isSwordOn() {
        return isSwordOn;
    }

    @Override
    public int getGear() {
        return gear;
    }
}
