package com.pluralsight;

public class Statistics {

    public static void main(String[] args) {

        // Create an instance of the Statistics class
        Statistics stats = new Statistics();

        // Print the average, max, min, and median of the test scores
        System.out.println("Average Score: " + stats.calculateAverage());
        System.out.println("Highest Score: " + stats.findMax());
        System.out.println("Lowest Score: " + stats.findMin());
        System.out.println("Median Score: " + stats.findMedian());
    }

    // Array of 10 test scores
    private int[] testScores = {100, 90, 98, 75, 63, 95, 84, 82, 72, 100};

    // Method to calculate the average of the test scores
    public double calculateAverage() {
        int sum = 0;
        for (int score : testScores) {
            sum += score;
        }
        return (double) sum / testScores.length;
    }

    // Method to find the maximum test score
    public int findMax() {
        int max = testScores[0];
        for (int score : testScores) {
            if (score > max) {
                max = score;
            }
        }
        return max;
    }

    // Method to find the minimum test score
    public int findMin() {
        int min = testScores[0];
        for (int score : testScores) {
            if (score < min) {
                min = score;
            }
        }
        return min;
    }

    // Method to find the median test score: median is the middle value in a sorted list of numbers
    public double findMedian() {
        int[] sortedScores = testScores.clone();
        java.util.Arrays.sort(sortedScores);
        int middle = sortedScores.length / 2;
        if (sortedScores.length % 2 == 0) {
            return (sortedScores[middle - 1] + sortedScores[middle]) / 2.0;
        } else {
            return sortedScores[middle];
        }
    }
}