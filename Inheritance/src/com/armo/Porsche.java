package com.armo;

public class Porsche extends Car {

    private boolean isTurboOn;

    public Porsche(int gear, boolean isTurboOn) {
        super(100, gear);
        this.isTurboOn = isTurboOn;
    }

    public void turnOnTurbo(boolean isTurboOn){
        this.isTurboOn = isTurboOn;
        System.out.println("Changed turbo to: " + isTurboOn);
    }

    public boolean isTurboOn() {
        return isTurboOn;
    }
}
