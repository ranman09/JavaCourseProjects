package com.armo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter how many numbers: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int [] array = readIntegers(count);
        System.out.println(Arrays.toString(array));
        System.out.println("Minimum value is : " + findMin(array));
    }

    public static int [] readIntegers(int numbers){
        int [] values = new int[numbers];
        System.out.println("Enter " + numbers + " numbers: ");
        for (int i = 0; i < numbers; i++){
            values[i] = scanner.nextInt();
        }
        scanner.close();
        return values;
    }

    public static int findMin(int [] array){
        int minVal = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] < minVal){
                minVal = array[i];
            }
        }
        return minVal;
    }
}
