package com.armo;

public class Main {

    public static void main(String[] args) {
	    char value = 'e';

	    switch (value){
            case 'A':
            case 'a':
                System.out.println("The value is A");
                break;
            case 'B':
            case 'b':
                System.out.println("The value is B");
                break;
            case 'C':
            case 'c':
                System.out.println("The value is C");
                break;
            case 'D':
            case 'd':
                System.out.println("The value is D");
                break;
            default:
                System.out.println("Value not found");
                break;
        }

    }
}
