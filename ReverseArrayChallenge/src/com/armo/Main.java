package com.armo;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] values = {1,2,3,4,5,6,7};
        int [] valuesToReverse = Arrays.copyOf(values, values.length);

        reverse(valuesToReverse);

        System.out.println("Values in reverse: " + Arrays.toString(valuesToReverse));
        System.out.println("Values not in reverse: " + Arrays.toString(values));

    }

    public static void reverse(int [] array){
        int temp;
        // will switch numbers from then end and the first. Decrease 1 until i = array.length/2.
        // Divided by 2 because we are switching 2 numbers at a time.
        for (int i = 0; i < (array.length / 2); i++){
            temp = array[(array.length-1)-i];
            array[(array.length-1)-i] = array[i];
            array[i] = temp;
        }
    }
}
