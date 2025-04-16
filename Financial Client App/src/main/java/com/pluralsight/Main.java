package com.pluralsight;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt for the user to enter client details
        System.out.println("---- Add a New Client ----");
        System.out.print("First Name: ");
        String firstName = sc.nextLine();

        System.out.print("Last Name: ");
        String lastName = sc.nextLine();

        System.out.print("Business Name: ");
        String businessName = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Phone Number: ");
        String phoneNumber = sc.nextLine();

        // Create a new client using the user input
        Client client = new Client(firstName, lastName, businessName, email, phoneNumber);

        // Display the client's info
        System.out.println("\n Client Registered:");
        System.out.println("Formatted Name: " + client.getFormattedName());
        System.out.println("First Name: " + client.getFirstName());
        System.out.println("Last Name: " + client.getLastName());
        System.out.println("Business Name: " + client.getBusinessName());
        System.out.println("Email: " + client.getEmail());
        System.out.println("Phone Number: " + client.getPhoneNumber());

        // Create an array of Client objects
        Client[] clients = new Client[3];

        // Initialize each client in the array
        clients[0] = new Client("John", "Doe", "Company", "johndoe@gmail.com", "123-456-7890");
        clients[1] = new Client("John", "Doe", "Company", "johndoe@gmail.com", "123-456-7890");
        clients[2] = new Client("John", "Doe", "Company", "johndoe@gmail.com", "123-456-7890");

        // Menu format
        System.out.println("What would you like to do? ");
        System.out.println("1. Show all business names");
        System.out.println("2. Show all email addresses");
        System.out.print("> ");
        int choice = sc.nextInt();

        System.out.println();

        // Handle choice logic
        if (choice == 1) {
            System.out.println("Showing all business names...");
            for (Client c: clients) {
                System.out.println("- " + client.getBusinessName());
            }
        } else if (choice == 2) {
            System.out.println("Showing all email addresses...");
            for (Client c: clients) {
                System.out.println("- " + client.getEmail());
            }
        } else {
            System.out.println("Invalid choice. please enter 1 or no.");
        }
        sc.close();
//
//        // Loop through the array and print client details
//        for (int i = 0; i < clients.length; i++) {
//            System.out.println("Client " + (i + 1) + ":");
//            System.out.println("Formatted Name: " + clients[i].getFormattedName()); // ← Format Name
//            System.out.println("First Name: " + clients[i].getFirstName());
//            System.out.println("Last Name: " + clients[i].getLastName());
//            System.out.println("Business Name: " + clients[i].getBusinessName());
//            System.out.println("Email: " + clients[i].getEmail());
//            System.out.println("Phone Number: " + clients[i].getPhoneNumber());
//            System.out.println();
//        }

        // Create a client to test constructor
//        Client client1 = new Client("John", "Doe", "Company", "johndoe@gmail.com", "123-456-7890");

        // Print names formatted
//        System.out.println("Formatted Name: ");
//        System.out.println(client1.getFormattedName());

//        System.out.println("Client 1: ");
//        System.out.println("First Name: " + client1.getFirstName());
//        System.out.println("Last Name: " + client1.getLastName());
//        System.out.println("Business Name: " + client1.getBusinessName());
//        System.out.println("Email: " + client1.getEmail());
//        System.out.println("Phone Number: " + client1.getPhoneNumber());

        // Calling method to display only the email addresses
//        displayClientEmails(clients);
    }

    // Method to display the email addresses
    public static void displayClientEmails(Client[] clients) {
//        System.out.println("Client Email Addresses: ");
        for (int i =0; i < clients.length; i++) {
            System.out.println("- " + clients[i].getEmail());
        }
    }

    // Change Clients email (setter)
//    client.setEmail("newemail@gmail.com");
}