package com.armo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int count = 0;
	    int sum = 0;

        Scanner scanner = new Scanner(System.in);

	    while (count != 5){
            System.out.println("Please enter a number: ");
            boolean isInt = scanner.hasNextInt();

            if (isInt) {
                int number = scanner.nextInt();
                scanner.nextLine();
                sum += number;
                count++;
                System.out.println("Entered number: " + count);
            } else {
                System.out.println("Invalid number!");
                scanner.nextLine();
            }
        }

        System.out.println("The sum of all 5 numbers is = " + sum);
        scanner.close();
    }
}
