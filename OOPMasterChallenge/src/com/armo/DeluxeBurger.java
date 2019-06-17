package com.armo;

public class DeluxeBurger extends Hamburger{

    Additional item1 = new Additional("Chips", 2.0);
    Additional item2 = new Additional("Drinks", 2.0);

    public DeluxeBurger() {
        super("Deluxe Burger", "Special Bread", "Yummy Meat");
        super.setPrice(25.0);
    }

    @Override
    public void addAdditional(Additional additional) {
        System.out.println("Additional is not allowed");
    }

    @Override
    public void printOrderSummary() {
        System.out.println("Your Order: ");
        printBurgerType();
        System.out.println(
                        "Additional " + "\n" +
                        "Item 1: " + this.item1.getName() + " Price: " + this.item1.getPrice() + "\n" +
                        "Item 2: " + this.item2.getName() + " Price: " + this.item2.getPrice() + "\n");
    }

    @Override
    public void printTotal() {
        super.setAdditionalPrice(item1.getPrice() + item2.getPrice());
        super.printTotal();
    }
}
