package com.armo;

public class Main {

    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int evenNumber = 0;

        while (number <= finishNumber){
            number++;
            if (!isEvenNumber(number)){
                System.out.println("Not Even number: " + number);
                continue;
            } else {
                evenNumber += 1;
            }
            System.out.println("Even number :" + number);
        }

        System.out.println("Even numbers found: " + evenNumber);
    }

    private static boolean isEvenNumber(int number){

        if (number % 2 > 0){
            return false;

        } else {
            return true;
        }

    }
}
