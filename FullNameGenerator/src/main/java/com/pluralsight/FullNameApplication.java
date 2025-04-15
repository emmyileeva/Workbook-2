package com.pluralsight;
import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {

        // Create scanner object to read the user's input
        Scanner input = new Scanner(System.in);

        // Ask user to enter name
        System.out.println("Please enter you name. ");

        // Enter first name
        System.out.print("First name: ");
        String firstName = input.nextLine().trim();

        // Enter middle name
        System.out.print("Middle Name: ");
        String middleName = input.nextLine().trim();

        // Enter last name
        System.out.print("Last name: ");
        String lastName = input.nextLine().trim();

        // Enter suffix
        System.out.print("Suffix: ");
        String suffix = input.nextLine().trim();

        // Start building the full name
        String fullName = firstName;

        // Add middle name if it's not empty
        if (!middleName.isEmpty()) {
            fullName += " " + middleName;
        }
        // Always add last name
        fullName += " " + lastName;

        // Add suffix with a comma if it's not empty
        if (!suffix.isEmpty()) {
            fullName += ", " + suffix;
        }

        // Print the final full name
        System.out.println("Full name: " + fullName);

        // Close scanner
        input.close();
    }
}
