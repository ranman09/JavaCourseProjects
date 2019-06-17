package com.armo;

public class Lights {
    private String color;
    private boolean isOpen;

    public Lights(String color){
        this.color  = color;
    }

    public void openLights(){
        this.isOpen = true;
        System.out.println("Lights.class: Opened lights");
    }

    public  void closeLights(){
        this.isOpen = false;
        System.out.println("Lights.class: Closed lights");
    }


}
