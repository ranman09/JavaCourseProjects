package com.company;

public class Main {

    public static void main(String[] args) {
        boolean isGameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (isGameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was: " + finalScore);

            score = 10000;
            levelCompleted = 8;
            bonus = 200;

            finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was: " + finalScore);
        } else {
            System.out.println("Your final score is = Tada!! ZERO");
        }


    }
}
