package com.pluralsight;

public class Dice {
    // Roll Method
    public int roll() {
        // Define the range of values
        int minValue = 1;
        int maxValue = 6;
        // Generate a random number between 1 and 6
        return (int)(Math.random() * maxValue) + minValue;
    }
}
