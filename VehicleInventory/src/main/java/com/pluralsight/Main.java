package com.pluralsight;

import java.util.Scanner;

public class Main {
    // Maximum number of vehicles
    private static final int MAX_VEHICLES = 20;
    // Array to store vehicles
    private static Vehicle[] vehicles = new Vehicle[MAX_VEHICLES];
    // Counter for the number of vehicles
    private static int vehicleCount = 0;
    // Scanner for user input
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Preload the array with 6 vehicles
        preloadVehicles();

        int command = 0;
        while (command != 6) {
            displayMenu();
            command = scanner.nextInt();
            handleCommand(command);
        }
    }

    private static void preloadVehicles() {
        vehicles[vehicleCount++] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        vehicles[vehicleCount++] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        vehicles[vehicleCount++] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        vehicles[vehicleCount++] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        vehicles[vehicleCount++] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        vehicles[vehicleCount++] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);
    }

    private static void displayMenu() {
        System.out.println("What do you want to do?");
        System.out.println(" 1 - List all vehicles");
        System.out.println(" 2 - Search by make/model");
        System.out.println(" 3 - Search by price range");
        System.out.println(" 4 - Search by color");
        System.out.println(" 5 - Add a vehicle");
        System.out.println(" 6 - Quit");
        System.out.println("Enter your command: ");
    }

    private static void handleCommand(int command) {
        switch (command) {
            case 1 -> listAllVehicles();
            case 2 -> searchByMakeModel();
            case 3 -> searchByPriceRange();
            case 4 -> searchByColor();
            case 5 -> addVehicle();
            case 6 -> System.out.println("Exiting the program. Goodbye!");
        }
    }

    private static void listAllVehicles() {
        for (Vehicle vehicle : vehicles) {
            if (vehicle != null) {
                System.out.println(vehicle.getDetails());
            }
        }
    }

    private static void searchByMakeModel() {
        System.out.println("Enter make/model: ");
        scanner.nextLine();
        String makeModel = scanner.nextLine().toLowerCase();
        for (Vehicle vehicle : vehicles) {
            if (vehicle != null && vehicle.getMakeModel().toLowerCase().contains(makeModel)) {
                System.out.println(vehicle.getDetails());
            }
        }
    }

    private static void searchByPriceRange() {
        System.out.println("Enter minimum price: ");
        float minPrice = scanner.nextFloat();
        System.out.println("Enter maximum price: ");
        float maxPrice = scanner.nextFloat();
        for (Vehicle vehicle : vehicles) {
            if (vehicle != null && vehicle.getPrice() >= minPrice && vehicle.getPrice() <= maxPrice) {
                System.out.println(vehicle.getDetails());
            }
        }
    }

    private static void searchByColor() {
        System.out.println("Enter color: ");
        String color = scanner.next();
        for (Vehicle vehicle : vehicles) {
            if (vehicle != null && vehicle.getColor().equalsIgnoreCase(color)) {
                System.out.println(vehicle.getDetails());

            }
        }
    }

    private static void addVehicle() {
        if (vehicleCount < vehicles.length) {
            System.out.println("Enter vehicle ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter make/model: ");
            String newMakeModel = scanner.nextLine();
            System.out.println("Enter color: ");
            String newColor = scanner.nextLine();
            System.out.println("Enter mileage: ");
            int mileage = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter price: ");
            float price = scanner.nextFloat();
            scanner.nextLine();
            vehicles[vehicleCount++] = new Vehicle(id, newMakeModel, newColor, mileage, price);
            System.out.println("Vehicle added successfully!");
        } else {
            System.out.println("Vehicle list is full!");
        }
    }
}