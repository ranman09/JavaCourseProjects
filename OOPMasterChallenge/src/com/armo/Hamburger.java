package com.armo;

public class Hamburger {

    private String name;
    private String rollType;
    private String meat;
    private double price = 5.0;
    private double additionalPrice = 0.0;
    private final int ADDITIONAL = 4;
    private int additionalCount = 1;

    private Additional item1;
    private Additional item2;
    private Additional item3;
    private Additional item4;

    public Hamburger(String name, String rollType, String meat) {
        this.name = name;
        this.rollType = rollType;
        this.meat = meat;
    }

    public void addAdditional(Additional additional){
        if (additionalCount <= ADDITIONAL){
            System.out.println(additional.getName() + " is added to your Burger!");

            switch (additionalCount){
                case 1:
                    this.item1 = new Additional(additional.getName(),additional.getPrice());
                    additionalPrice += this.item1.getPrice();
                    break;
                case 2:
                    this.item2 = new Additional(additional.getName(),additional.getPrice());
                    additionalPrice += this.item2.getPrice();
                    break;
                case 3:
                    this.item3 = new Additional(additional.getName(),additional.getPrice());
                    additionalPrice += this.item3.getPrice();
                    break;
                case 4:
                    this.item4 = new Additional(additional.getName(),additional.getPrice());
                    additionalPrice += this.item4.getPrice();
                    break;
            }

            additionalCount += 1;

        } else {
            System.out.println("4 maximum additional reached!");
        }
    }

    public void printOrderSummary(){
        System.out.println("Your Order: ");
        printBurgerType();
        System.out.println(
                "Additional " + "\n" +
                "Item 1: " + this.item1.getName() + " Price: " + this.item1.getPrice() + "\n" +
                "Item 2: " + this.item2.getName() + " Price: " + this.item2.getPrice() + "\n" +
                "Item 3: " + this.item3.getName() + " Price: " + this.item3.getPrice() + "\n" +
                "Item 4: " + this.item4.getName() + " Price: " + this.item4.getPrice());
    }

    public void printBurgerType(){
        System.out.println("Burger Type : " + this.getClass().getSimpleName() + " Price: " + this.price);
    }

    public void printTotal(){
        System.out.println("Total order amount: " + (this.price + this.additionalPrice));
    }

    public String getName() {
        return name;
    }

    public String getRollType() {
        return rollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public int getADDITIONAL() {
        return ADDITIONAL;
    }

    public Additional getItem1() {
        return item1;
    }

    public Additional getItem2() {
        return item2;
    }

    public Additional getItem3() {
        return item3;
    }

    public Additional getItem4() {
        return item4;
    }

    public int getAdditionalCount() {
        return additionalCount;
    }

    public double getAdditionalPrice() {
        return additionalPrice;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAdditionalPrice(double additionalPrice) {
        this.additionalPrice = additionalPrice;
    }
}
