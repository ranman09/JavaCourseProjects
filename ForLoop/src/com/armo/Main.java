package com.armo;

public class Main {

    public static void main(String[] args) {

        int count = 0;

        for (int i=1 ; i<10 ; i++){
            if (isPrime(i)){
                System.out.println(i + " is a Prime number");
                count++;
                if (count == 3){
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }

    }

    private static boolean isPrime(int n){
        if (n == 1){
            return false;
        }

        for (int i=2; i <= n/2 ; i++){
            if (n%i == 0){
                return false;
            }
        }

        return true;

    }
}
