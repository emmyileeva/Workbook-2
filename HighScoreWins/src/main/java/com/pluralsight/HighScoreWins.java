package com.pluralsight;
import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt for user input
        System.out.print("Please enter a game score: ");
        String scoreInput = input.nextLine();

        // Split on the pipe (|)
        String[] parts = scoreInput.split("\\|");
        String[] teams = parts[0].split(":");
        String[] scores = parts[1].split(":");

        String team1 = teams[0];
        String team2 = teams[1];
        int score1 = Integer.parseInt(scores[0]);
        int score2 = Integer.parseInt(scores[1]);

        // Display the winner and find the winner
        if (score1 > score2) {
            System.out.println("Winner: " + team1);
        } else if (score2 > score1) {
            System.out.println("Winner: " + team2);
        } else {
            System.out.println("It's a tie!");
        }
input.close();
    }
}
