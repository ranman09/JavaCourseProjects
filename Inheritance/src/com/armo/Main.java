package com.armo;

public class Main {

    public static void main(String[] args) {
        Porsche porsche = new Porsche(0,false);

        System.out.println("Porsche's speed is: " + porsche.getSpeed());

        System.out.println("Porsche's gear is: " + porsche.getGear());
        porsche.changeGear(5);
        System.out.println("Porsche's gear is: " + porsche.getGear());
        porsche.changeGear(2);
        System.out.println("Porsche's gear is: " + porsche.getGear());

        System.out.println("Porsche's handsteer is: " + porsche.getHandSteer());
        porsche.changeHandSteer("Left");
        System.out.println("Porsche's handsteer is: " + porsche.getHandSteer());

        porsche.turnOnTurbo(true);
        System.out.println("Porsche's turbo is: " + porsche.isTurboOn());

        System.out.println("\n**********************\n");

        Bumblebee bumblebee = new Bumblebee(0, false);

        System.out.println("Bumblebee's speed is: " + bumblebee.getSpeed());

        System.out.println("Bumblebee's gear is: " + bumblebee.getGear());
        bumblebee.changeGear(5);
        System.out.println("Bumblebee's gear is: " + bumblebee.getGear());

        System.out.println("Bumblebee's handsteer is: " + bumblebee.getHandSteer());
        bumblebee.changeHandSteer("Right");
        System.out.println("Bumblebee's handsteer is: " + bumblebee.getHandSteer());

        bumblebee.turnOnSword(true);
        System.out.println("Bumblebee's sword is: " + bumblebee.isSwordOn());


    }
}
