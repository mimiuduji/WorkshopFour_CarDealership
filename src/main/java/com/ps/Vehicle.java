package com.ps;

public class Vehicle {
    private String make;
    private String model;
    private String type;
    private String color;
    private int year;
    private int mileage;
    private double price;

    public Vehicle(String make, String model, String type, String color, int year, int mileage, double price) {
        this.make = make;
        this.model = model;
        this.type = type;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
    }

    // Getters and Setters for each field
    public String getMake() { return make; }
    public void setMake(String make) { this.make = make; }
    // (Add remaining getters and setters here)

    @Override
    public String toString() {
        return make + " " + model + " - " + type + " - " + color + " - Year: " + year +
                " - Mileage: " + mileage + " miles - $" + price;
    }
}
