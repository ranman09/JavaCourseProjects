package com.armo;

public class Main {

    final private static double feetVal = 12; //inches
    final private static double inchesVal = 2.54; //centimeters

    public static void main(String[] args) {

        System.out.println(calcFeetAndInchesToCentimeters(6,6));
        System.out.println(calcFeetAndInchesToCentimeters(500));

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){

        double pass = -1;

        if (feet >=0){
            if (inches >=0 && inches <= 12){

                double feetCalc = (feet * feetVal) * inchesVal;
                double inchesCalc = (inches * inchesVal);

                pass = feetCalc + inchesCalc; // centimeters

            }
        }

        return pass;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        double pass = -1;

        if (inches >= 0){

            double inFeet = (int)inches / (int)feetVal;
            double leftInch =  (int)inches % (int)feetVal;

            double inCm = calcFeetAndInchesToCentimeters(inFeet,leftInch);
            System.out.println("In cm = " + inCm);

            pass = (inCm / inchesVal) / feetVal;

        }

        return pass;
    }
}
