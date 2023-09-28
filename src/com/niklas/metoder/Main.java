package com.niklas.metoder;

public class Main {
    public static void main(String[] args) {

        int[] scores = {0, 150, 500, 5000};

        printScores(scores);
        checkScoreIfZero(scores);
    }

    public static void printScores(int[] scores) {
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
    }

    public static void checkScoreIfZero(int[] scores) {
        if (scores[0] == 0) {
                System.out.println("The score was indeed 0");
            } else {
                System.out.println("The score wasn't 0");
        }
    }
}