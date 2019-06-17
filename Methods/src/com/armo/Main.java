package com.armo;

public class Main {

    public static void main(String[] args) {

        displayMethods("Rambo" , 1500);
        displayMethods("John", 900);
        displayMethods("Ryan", 400);
        displayMethods("Mingming" , 50);
        displayMethods("Mingming" , 1000);

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition){

        System.out.println("Player " + playerName + " managed to get to position " + highScorePosition + " on the highscore table");

    }

    public static int calculateHighScorePosition(int highScore){

        if (highScore >= 1000){

            return 1;

        }else if (highScore >= 500 && highScore < 1000){

            return 2;

        }else if (highScore >= 100 &&  highScore < 500){

            return 3;

        }else{

            return 4;

        }

    }

    public static void displayMethods (String playerName, int score){
        int highScorePosition = calculateHighScorePosition(score);

        displayHighScorePosition(playerName,highScorePosition);
    }
}
