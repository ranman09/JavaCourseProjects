package com.armo;

public class Main {

    public static void main(String[] args) {
	    Door door = new Door("Mahogany");
	    Lights lights = new Lights("White");
	    Window window = new Window("Silver",2);

	    House myHouse = new House(door, lights, window);

	    myHouse.openDoor();

		myHouse.getWindow().openWindow();

    }
}
