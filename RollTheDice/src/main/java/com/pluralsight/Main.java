package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        // Create a new Dice object
        Dice dice = new Dice();

        // Int variables for rolls
        int roll1;
        int roll2;

        // Declare counters
        int count2 = 0;
        int count4 = 0;
        int count6 = 0;
        int count7 = 0;

        // Loop for 100 rolls
        for (int i = 0; i < 100; i++) {
            // Roll the dice
            roll1 = dice.roll();
            roll2 = dice.roll();

            // Calculate the sum of the rolls
            int sum = roll1 + roll2;

            // Print the result
            System.out.println("Roll 1: " + roll1 + " - " + roll2 + " Sum: " + sum);

            // Count the occurrences of each sum
            if (sum == 2) {
                count2++;
            } else if (sum == 4) {
                count4++;
            } else if (sum == 6) {
                count6++;
            } else if (sum == 7) {
                count7++;
            }
        }
        // Print the counts
        System.out.println("Count of 2: " + count2);
        System.out.println("Count of 4: " + count4);
        System.out.println("Count of 6: " + count6);
        System.out.println("Count of 7: " + count7);
    }
}