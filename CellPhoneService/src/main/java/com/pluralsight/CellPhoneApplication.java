package com.pluralsight;
import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        class CellPhone {
            private int serialNumber;
            private String Model;
            private String Carrier;
            private String phoneNumber;
            private String owner;

            // Constructor
            public CellPhone() {
                this.serialNumber = 0;
                this.Model = "";
                this.Carrier = "";
                this.phoneNumber = "";
                this.owner = "";
            }

            public int getserialNumber() {
                return serialNumber;
            }

            public void setserialNumber(int serialNumber) {
                this.serialNumber = serialNumber;
            }

            public String getModel() {
                return Model;
            }

            public void setModel(String model) {
                Model = model;
            }

            public String getCarrier() {
                return Carrier;
            }

            public void setCarrier(String carrier) {
                Carrier = carrier;
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
        }
        // Create an instance of CellPhone
        CellPhone cellPhone = new CellPhone();

        System.out.print("What is the serial number of the cell phone? ");
        cellPhone.setserialNumber(scanner.nextInt());
        scanner.nextLine(); // Consume the newline character

        System.out.print("What is the model of the cell phone? ");
        cellPhone.setModel(scanner.nextLine());

        System.out.print("What is the carrier of the cell phone? ");
        cellPhone.setCarrier(scanner.nextLine());

        System.out.print("What is the phone number of the cell phone? ");
        cellPhone.setPhoneNumber(scanner.nextLine());

        System.out.print("Who is the owner of the cell phone? ");
        cellPhone.setOwner(scanner.nextLine());

        System.out.println( "----------------------------------------");

        // Display the cell phone information
        System.out.println("Cell Phone Information:");
        System.out.println("Serial Number: " + cellPhone.getserialNumber());
        System.out.println("Model: " + cellPhone.getModel());
        System.out.println("Carrier: " + cellPhone.getCarrier());
        System.out.println("Phone Number: " + cellPhone.getPhoneNumber());
        System.out.println("Owner: " + cellPhone.getOwner());

        scanner.close();
    }
}
