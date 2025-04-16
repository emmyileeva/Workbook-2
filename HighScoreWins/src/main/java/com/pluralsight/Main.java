package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}



public static String grabFirstWord(String input) {
    return input.substring(0, input.indexOf(' '));
}

public static String grabLastWord(String input) {
    return input.substring(input.lastIndexOf(' ') + 1);
}
