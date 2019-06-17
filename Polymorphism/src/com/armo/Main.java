package com.armo;

public class Main {

    public static void main(String[] args) {
        Expander expander = new Expander();
        System.out.println("Car Expander engine: " + expander.getEngineModel());
        expander.startEngine();
        expander.accelerate();
        expander.brake();
        System.out.println("");

        Porsche porsche = new Porsche();
        System.out.println("Car Porsche engine: " + porsche.getEngineModel());
        porsche.startEngine();
        porsche.accelerate();
        porsche.brake();
        System.out.println("");

        Tesla tesla = new Tesla();
        System.out.println("Car Tesla engine: " + tesla.getEngineModel());
        tesla.startEngine();
        tesla.accelerate();
        tesla.brake();
        System.out.println("");


    }
}
