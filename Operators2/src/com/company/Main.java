package com.company;

public class Main {

    public static void main(String[] args) {
        double firstDoub = 20;
        double secondDoub = 80;
        double result = (firstDoub + secondDoub) * 25;
        double remainingResult = result % 40;
        System.out.println("remaining result = " + remainingResult);
        if (remainingResult <= 20)
            System.out.println("Total was over limit");
    }
}
