package com.armo;

public class House {
    private Door door;
    private Lights lights;
    private Window window;

    public House(Door door, Lights lights, Window window){
        this.door = door;
        this.lights = lights;
        this.window = window;
    }

    public Window getWindow() {
        return window;
    }

    public void openDoor(){
        this.door.openDoor();
        openLights();
    }

    private void openLights(){
        this.lights.openLights();
    }
}
