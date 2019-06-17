package com.armo;

public class Main {

    public static void main(String[] args) {

        System.out.println(getDurationString(61, 59));
        System.out.println(getDurationString(3701));

    }

    public static String getDurationString(int minutes, int seconds){

        if ((minutes >=0) && (seconds >=0) && (seconds <= 59)){
            int calcHour = minutes / 60;
            int calcMinutes = minutes % 60;

            return calcHour + "h " + calcMinutes + "m " + seconds + "s ";
        } else {
            return "Invalid value";
        }

    }

    public static String getDurationString(int seconds){
        if (seconds >= 0){
            int calcSeconds = seconds % 60;
            int calcMinutes = seconds / 60;

            return getDurationString(calcMinutes, calcSeconds);

        } else {
            return "Invalid value";
        }
    }

}
