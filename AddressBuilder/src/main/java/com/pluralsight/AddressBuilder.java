package com.pluralsight;
import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a StringBuilder object
        StringBuilder address = new StringBuilder();

        // Ask user for information
        System.out.println("Please provide the following information: ");
        System.out.print("Full name: ");
        String fullName = sc.nextLine();
        address.append(fullName).append("\n\n");

        System.out.println(" ");

        // Ask user for billing street
        System.out.print("Billing Street: ");
        String billingStreet = sc.nextLine();
        // Ask user for billing city
        System.out.print("Billing City: ");
        String billingCity = sc.nextLine();
        // Ask user for billing state
        System.out.print("Billing State: ");
        String billingState = sc.nextLine();
        // Ask user for billing zip
        System.out.print("Billing Zip: ");
        String billingZip = sc.nextLine();

        address.append("Billing Address:\n");
        address.append(billingStreet).append("\n");
        address.append(billingCity).append(", ").append(billingState).append(" ").append(billingZip).append("\n\n");

        System.out.println(" ");

        // Ask user for shipping street
        System.out.print("Shipping Street: ");
        String shippingStreet = sc.nextLine();
        // Ask user for shipping city
        System.out.print("Shipping City: ");
        String shippingCity = sc.nextLine();
        // Ask user for shipping state
        System.out.print("Shipping State: ");
        String shippingState = sc.nextLine();
        // Ask user for shipping zip
        System.out.print("Shipping Zip: ");
        String shippingZip = sc.nextLine();

        address.append("Shipping Address: \n");
        address.append(shippingStreet).append("\n");
        address.append(shippingCity).append(", ").append(shippingState).append(" ").append(shippingZip).append("\n");

        // Final results
        System.out.println("\n" + address);

        sc.close();

    }
}
