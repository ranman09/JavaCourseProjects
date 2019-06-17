package com.armo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int [] values = getIntegers(5);
        System.out.println("Entered value: ");
        printArray(values);
        System.out.println("");
//        System.out.println("Sorted values: ");
//        int [] sortedValue = sortIntegers(values);
//        printArray(sortedValue);
//        System.out.println("");
//        System.out.println("Entered value: ");
//        printArray(values);
        System.out.println("");
        int [] sortedValueTwo = sortIntergersTwo(values);
        printArray(sortedValueTwo);

    }

    public static int [] getIntegers(int number){
        int [] values = new int[number];
        System.out.println("Please enter " + number + " numbers: \r");
        for (int i = 0; i < values.length ; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int [] array){
        for (int i = 0; i < array.length ; i++){
            System.out.println("Value number " + (i + 1) + " = " + array[i]);
        }
    }

//    public static int [] sortIntegers( int [] array){
//
//        int [] toSortArr = new int [array.length];
//
//        for (int i = 0; i < array.length; i++){
//            toSortArr[i] = array[i];
//        }
//
//        boolean passed = false;
//
//        while (!passed) {
//            for (int i = 0; i < (toSortArr.length - 1); i++){
//
//                toSortArr = sort(toSortArr);
//
//                if (toSortArr[i+1] > toSortArr[i]){
//                    passed = false;
//                } else {
//                    passed = true;
//                }
//            }
//        }
//
//        return toSortArr;
//    }
//
//    public static int [] sort(int [] array){
//        int temp;
//
//        for (int i = 0; i < (array.length - 1) ; i++){
//            if (array[i+1] > array[i]){
//                temp = array[i];
//                array[i] = array[i+1];
//                array[i+1] = temp;
//            }
//        }
//
//        return array;
//
//    }

    public static int [] sortIntergersTwo( int [] array){

        int [] toSortArr = Arrays.copyOf(array,array.length);

        boolean flag = true;
        int temp;

        while (flag){
            flag = false;
            for (int i = 0; i < (toSortArr.length-1); i++){
                if(toSortArr[i+1] > toSortArr[i]){
                    temp = toSortArr[i];
                    toSortArr[i] = toSortArr[i+1];
                    toSortArr[i+1] = temp;
                    flag = true;
                }
            }
        }

        return toSortArr;
    }


}
