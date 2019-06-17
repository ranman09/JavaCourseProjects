package com.armo;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        printDayOFTheWeek(6);

    }

    private static void printDayOFTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("The day is Monday");
                break;
            case 1:
                System.out.println("The day is Tuesday");
                break;
            case 2:
                System.out.println("The day is Wednesday");
                break;
            case 3:
                System.out.println("The day is Thursday");
                break;
            case 4:
                System.out.println("The day is Friday");
                break;
            case 5:
                System.out.println("The day is Saturday");
                break;
            case 6:
                System.out.println("The day is Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

        System.out.println("************************");

        if (day == 0){
            System.out.println("The day is Monday");
        } else if (day == 1){
            System.out.println("The day is Tuesday");
        } else if (day == 2){
            System.out.println("The day is Wednesday");
        } else if (day == 3){
            System.out.println("The day is Thursday");
        } else if (day == 4){
            System.out.println("The day is Friday");
        } else if (day == 5){
            System.out.println("The day is Saturday");
        } else if (day == 6){
            System.out.println("The day is Sunday");
        } else {
            System.out.println("Invalid day");
        }

    }
}
