package com.armo;

public class HealthyBurger extends Hamburger {
    private final int ADDITIONAL = 6;
    private Additional item5;
    private Additional item6;
    private int additionalCount;
    private double additionalPrice;


    public HealthyBurger() {
        super("Healthy Burger", "Brown Rye Bread Roll", "Grilled Meat");
        super.setPrice(15.0);
    }

    @Override
    public void addAdditional(Additional additional) {

        if (additionalCount <= 4){
            super.addAdditional(additional);
            additionalCount = super.getAdditionalCount();
            additionalPrice = super.getAdditionalPrice();

        } else if (additionalCount <= ADDITIONAL){
            System.out.println(additional.getName() + " is added to your Burger!");

            switch (additionalCount){
                case 5:
                    this.item5 = new Additional(additional.getName(),additional.getPrice());
                    additionalPrice += item5.getPrice();
                    break;
                case 6:
                    this.item6 = new Additional(additional.getName(),additional.getPrice());
                    additionalPrice += item6.getPrice();
                    break;
            }

            additionalCount += 1;
        } else {
            System.out.println("6 maximum additional reached!");
        }

    }

    @Override
    public void printOrderSummary() {
        super.printOrderSummary();
        System.out.println("Item 5: " + this.item5.getName() + " Price: " + this.item5.getPrice() + "\n" +
                "Item 6: " + this.item6.getName() + " Price: " + this.item6.getPrice());
    }

    @Override
    public void printTotal() {
        System.out.println("Total order amount: " + (super.getPrice() + this.additionalPrice));
    }

    @Override
    public int getADDITIONAL() {
        return ADDITIONAL;
    }

    public int getAdditionalCount() {
        return additionalCount;
    }

    public Additional getItem5() {
        return item5;
    }

    public Additional getItem6() {
        return item6;
    }
}
