package com.armo;

public class Door {
    private String color;
    private boolean isOpen;

    public Door(String color){
        this.color = color;
    }

    public void openDoor(){
        this.isOpen = true;
        System.out.println("Door class: door is opened");
    }

    public void closeDoor(){
        this.isOpen = false;
        System.out.println("Door class: door is closed");
    }

}
