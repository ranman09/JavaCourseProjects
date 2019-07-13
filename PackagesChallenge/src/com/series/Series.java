package com.series;

public class Series {

    private int val;

    public int nSum(int i){
        return val += i;
    }

    public int factorial(int i){
        if (i == 0){
            val=1;
            return 0;
        }
        return val *= i;
    }

    public int fibonacci(int i){
        if (i == 0){
            return 0;
        } else if(i == 1){
            return  1;
        }
        return fibonacci(i-1) + fibonacci(i-2);
    }
}
