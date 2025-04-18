package com.pluralsight;
import java.util.Scanner;

public class CellPhoneApplication {

        public static class CellPhone {
            private int serialNumber;
            private String model;
            private String carrier;
            private String phoneNumber;
            private String owner;

            // Constructor
            public CellPhone() {
                this.serialNumber = 0;
                this.model = "";
                this.carrier = "";
                this.phoneNumber = "";
                this.owner = "";
            }

            public int getSerialNumber() {
                return serialNumber;
            }

            public void setSerialNumber(int serialNumber) {
                this.serialNumber = serialNumber;
            }

            public String getModel() {
                return model;
            }

            public void setModel(String model) {
                this.model = model;
            }

            public String getCarrier() {
                return carrier;
            }

            public void setCarrier(String carrier) {
                this.carrier = carrier;
            }

            public String getPhoneNumber() {
                return phoneNumber;
            }

            public void setPhoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
            }

            public String getOwner() {
                return owner;
            }

            public void setOwner(String owner) {
                this.owner = owner;
            }

            // Dial Method
            public void dial(String phoneNumber) {
                System.out.println(owner + " is dialing " + phoneNumber);
            }
        }
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Create an instance of CellPhone
        CellPhone cellPhone = new CellPhone();

        // Set the properties of the first cell phone
        System.out.print("What is the serial number of the cell phone? ");
        cellPhone.setSerialNumber(scanner.nextInt());
        scanner.nextLine(); // Consume the newline character

        System.out.print("What is the model of the cell phone? ");
        cellPhone.setModel(scanner.nextLine());

        System.out.print("What is the carrier of the cell phone? ");
        cellPhone.setCarrier(scanner.nextLine());

        System.out.print("What is the phone number of the cell phone? ");
        cellPhone.setPhoneNumber(scanner.nextLine());

        System.out.print("Who is the owner of the cell phone? ");
        cellPhone.setOwner(scanner.nextLine());

        System.out.println("----------------------------------------");

        // Create second instance of CellPhone
        CellPhone cellPhone2 = new CellPhone();

        // Set the properties of the second cell phone
        System.out.print("What is the serial number of the second cell phone? ");
        cellPhone2.setSerialNumber(scanner.nextInt());
        scanner.nextLine(); // Consume the newline character

        System.out.print("What is the model of the second cell phone? ");
        cellPhone2.setModel(scanner.nextLine());

        System.out.print("What is the carrier of the second cell phone? ");
        cellPhone2.setCarrier(scanner.nextLine());

        System.out.print("What is the phone number of the second cell phone? ");
        cellPhone2.setPhoneNumber(scanner.nextLine());

        System.out.print("Who is the owner of the second cell phone? ");
        cellPhone2.setOwner(scanner.nextLine());

        System.out.println("----------------------------------------");

        // Display the cell phone information
        display(cellPhone);
        display(cellPhone2);

        // First cell phone dials the second cell phone
        cellPhone.dial(cellPhone2.getPhoneNumber());

        // Second cell phone dials the first cell phone
        cellPhone2.dial(cellPhone.getPhoneNumber());

        scanner.close();
    }
    public static void display(CellPhone cellPhone) {
        System.out.println("Cell Phone Information:");
        System.out.println("Serial Number: " + cellPhone.getSerialNumber());
        System.out.println("Model: " + cellPhone.getModel());
        System.out.println("Carrier: " + cellPhone.getCarrier());
        System.out.println("Phone Number: " + cellPhone.getPhoneNumber());
        System.out.println("Owner: " + cellPhone.getOwner());
        System.out.println("----------------------------------------");
    }
}