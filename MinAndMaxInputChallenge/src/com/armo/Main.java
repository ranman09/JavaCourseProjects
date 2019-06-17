package com.armo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int maximumNumber = 0;
	    int minimumNumber = 0;

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Enter number: ");
            boolean isInt = scanner.hasNextInt();
            if (isInt){
                int number = scanner.nextInt();

                if (number > maximumNumber){
                    maximumNumber = number;
                }
                if (number < minimumNumber || minimumNumber == 0){
                    minimumNumber = number;
                }

            } else {
                System.out.println("Invalid number!");
                break;
            }
            scanner.nextLine();
        }
        System.out.println("The maximum number is: " + maximumNumber);
        System.out.println("The minimum number is: " + minimumNumber);
        scanner.close();
    }
}
