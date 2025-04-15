package com.pluralsight;
import java.util.Scanner;

public class FullNameParserApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user to enter their full name
        System.out.print("Please enter your name: ");
        String fullName = input.nextLine().trim(); // Trim any spaces

        // Split the name into parts using spaces
        String[] nameParts = fullName.split(" ");

        String firstName = nameParts[0];
        String middleName;
        String lastName;

        // Check how many parts were entered
        if (nameParts.length == 2) {
            middleName = "(none)";
            lastName = nameParts[1];
        } else if (nameParts.length == 3) {
            middleName = nameParts[1];
            lastName = nameParts[2];
        } else {
            System.out.println("Invalid name format. Please enter in 'first last' or 'first middle last' format.");
            return;
        }

        // Display the results
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);

        input.close();
    }
}
