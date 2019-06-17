package com.armo;

public class Window {
    private String color;
    private int count;
    private boolean isOpen;

    public Window(String color, int count){
        this.color = color;
        this.count = count;
    }

    public void openWindow(){
        this.isOpen = true;
        System.out.println("Window.class: Window is opened");
    }


}
