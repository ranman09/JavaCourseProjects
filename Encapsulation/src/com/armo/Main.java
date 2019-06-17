package com.armo;

public class Main {

    public static void main(String[] args) {
        Printer normalPrinter = new Printer(100, 0,false);

        normalPrinter.printAPage("Hello");
        normalPrinter.setTonerLevel(50);
        System.out.println("NormalPrinter printed: " + normalPrinter.getPagesPrinted());

        normalPrinter.printAPage("World");
        System.out.println("NormalPrinter printed: " + normalPrinter.getPagesPrinted());



        Printer duplexPrinter = new Printer(50,0,true);
        System.out.println("");
        duplexPrinter.printAPage("Hi I am a duplex printer!");
        duplexPrinter.setTonerLevel(20);
        System.out.println("Duplex printer toner level = " + duplexPrinter.getTonerLevel());
        System.out.println("Duplex printer printed: " + duplexPrinter.getPagesPrinted());


    }
}
