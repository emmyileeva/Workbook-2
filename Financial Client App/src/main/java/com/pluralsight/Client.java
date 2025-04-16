package com.pluralsight;

public class Client {
    private String firstName;
    private String lastName;
    private String businessName;
    private String email;
    private String phoneNumber;

    // Constructor
    public Client(String firstName, String lastName, String businessName, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.businessName = businessName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Getters to access private variables
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBusinessName() {
        return businessName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Setter to update email
    public void setEmail(String email) {
        this.email = email;
    }

    // Format: lastName, firstName, I.
    public String getFormattedName() {
        return String.format("%s, %s %s.", this.lastName, this.firstName, this.firstName.charAt(0));
    }
}