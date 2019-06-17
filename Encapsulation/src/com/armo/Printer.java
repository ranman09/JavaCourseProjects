package com.armo;

public class Printer {
    private int tonerLevel = 100;
    private int printCount;
    private boolean isDuplexPrint;

    public Printer (int tonerLevel, int pagesPrinted, boolean isDuplexPrint){
        setTonerLevel(tonerLevel);
        this.printCount = pagesPrinted;
        this.isDuplexPrint = isDuplexPrint;
    }

    public void setTonerLevel(int tonerLevel){
        if (tonerLevel >0 && tonerLevel <=  100){
            this.tonerLevel = tonerLevel;
        } else {
            System.out.println("Error setting toner level \nToner level = " + this.tonerLevel);
        }
    }

    public void printAPage(String message){
        System.out.println("Duplex mode is: " + isDuplexPrint);
        System.out.println("Printing: " + message);
        printCount += 1;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return printCount;
    }

    public boolean isDuplexPrint() {
        return isDuplexPrint;
    }
}
