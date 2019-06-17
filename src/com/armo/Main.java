package com.armo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int [] integers = readIntegers(5);
        System.out.println(Arrays.toString(integers));
        System.out.println("The minimum value is: " + findMin(integers));
    }

    public static int [] readIntegers(int count){
        int [] values = new int[count];

        System.out.println("Enter " + count + " numbers:");
        for (int i = 0; i < count; i++){
            values[i] = scanner.nextInt();
        }

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
