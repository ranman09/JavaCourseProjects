package com.armo;

public class Main {

    public static void main(String[] args) {
	// write your code here
    // n % 10 = last digit
    // n / 10 = first digits

        System.out.println("Test for 125: " + sumDigits(125));
        System.out.println("Test for -1: " + sumDigits(-1));
        System.out.println("Test for 10: " + sumDigits(10));
        System.out.println("Test for 8: " + sumDigits(8));
        System.out.println("Test for 12345: " + sumDigits(12345));

    }

    private static int sumDigits(int number){
        int n;
        int total = 0;

        if (number >= 10) {
            while (number != 0) {
                // get last digit
                n = number % 10;
                // get remaining digits and set to number
                number = number / 10;
                total += n;
            }
            return total;
        } else {
            System.out.println("Number is invalid");
            return -1;
        }
    }
}
