package com.armo;

public class Main {

    public static void main(String[] args) {

        int sumAll = 0;
        int j = 0;

	    for (int i = 1; i < 1000 ; i++){
	        if ((i%3 == 0) && (i%5 == 0)){
	            j++;
	            sumAll += i;
                System.out.println("Found number: " + i);
            }
	        if (j == 5){
	            break;
            }
        }

        System.out.println("The sum of all div3 and div5 is: " + sumAll);
    }
}
