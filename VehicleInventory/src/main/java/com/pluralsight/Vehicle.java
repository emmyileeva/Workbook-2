package com.pluralsight;

public class Vehicle {

    // Fields
    private long vehicleId;
    private String makeModel;
    private String color;
    private int odometerReading;
    private float price;
    // Constructor
    public Vehicle(long vehicleId, String makeModel, String color, int odometerReading, float price) {
        this.vehicleId = vehicleId;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;
    }
    // Method to display vehicle details
    public String getDetails() {
        return "Vehicle ID: " + vehicleId + ", Make/Model: " + makeModel + ", Color: " + color +
               ", Odometer Reading: " + odometerReading + ", Price: $" + price;
    }
    // Getters and Setters
    public long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
