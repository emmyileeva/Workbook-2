package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user for full name
        System.out.print("Please enter your full name: ");
        String fullName = input.nextLine().trim();

        // Split the full name into first and last
        String[] nameParts = fullName.split(" ");
        String firstName = nameParts[0];
        String lastName = nameParts[1];

        // Ask user for the date
        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String dateInput = input.nextLine().trim();

        // Convert the date format to yyyy-MM-dd
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("M/d/yyyy");
        LocalDate date = LocalDate.parse(dateInput, inputFormatter);

        // Ask user for number of tickets
        System.out.print("How many tickets would you like? ");
        int ticketCount = input.nextInt();

        // Plural or singular for "ticket"
        String ticketWord = ticketCount == 1 ? "ticket" : "tickets";

        // Show confirmation of reservation
        System.out.println(ticketCount + " " + ticketWord + " reserved for " + date + " under " + lastName + ", " + firstName);

        input.close();
    }
}
