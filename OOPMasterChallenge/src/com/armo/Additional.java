package com.armo;

public class Additional {
    private String name;
    private double price;

    public Additional(String name, double price) {
        if (name == null){
            this.name = "no selected item";
        } else {
            this.name = name;
        }

        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
