package com.armo;

public class Main {

    public static void main(String[] args) {

        HealthyBurger healthyBurger = new HealthyBurger();

        // additionals menu: lettuce, tomato, carrot, kethup, mayonaise, onion, cheese
        Additional lettuce = new Additional("lettuce", 1.0);
        Additional carrot = new Additional("carrot", 1.0);
        Additional ketchup = new Additional("ketchup", 1.0);
        Additional mayonaise = new Additional("mayonaise", 1.0);
        Additional onion = new Additional("onion", 1.0);
        Additional cheese = new Additional("cheese", 1.0);

        healthyBurger.addAdditional(lettuce);
        healthyBurger.addAdditional(ketchup);
        healthyBurger.addAdditional(onion);
        healthyBurger.addAdditional(cheese);
        healthyBurger.addAdditional(mayonaise);
        healthyBurger.addAdditional(carrot);
        System.out.println("");
        healthyBurger.printOrderSummary();
        healthyBurger.printTotal();

        System.out.println("***********************************");

        Hamburger myHamburger = new Hamburger("myHamburger", "Pita", "Beef");

        myHamburger.addAdditional(lettuce);
        myHamburger.addAdditional(ketchup);
        myHamburger.addAdditional(onion);
        myHamburger.addAdditional(cheese);
        myHamburger.addAdditional(mayonaise);
        myHamburger.addAdditional(carrot);
        System.out.println("");
        myHamburger.printOrderSummary();
        myHamburger.printTotal();

        System.out.println("***********************************");

        DeluxeBurger deluxeBurger = new DeluxeBurger();

        deluxeBurger.addAdditional(lettuce);
        deluxeBurger.addAdditional(ketchup);
        deluxeBurger.addAdditional(onion);
        deluxeBurger.addAdditional(cheese);
        deluxeBurger.addAdditional(mayonaise);
        deluxeBurger.addAdditional(carrot);
        System.out.println("***********************************");
        deluxeBurger.printOrderSummary();
        deluxeBurger.printTotal();
    }
}
