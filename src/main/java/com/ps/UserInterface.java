package com.ps;

import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;

    public UserInterface(Dealership dealership) {
        this.dealership = dealership;
    }

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. List All Vehicles");
            System.out.println("2. Add a Vehicle");
            System.out.println("3. Remove a Vehicle");
            System.out.println("99. Quit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> listAllVehicles();
                case 2 -> addVehicle(scanner);
                case 3 -> removeVehicle(scanner);
                case 99 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void listAllVehicles() {
        for (Vehicle v : dealership.getAllVehicles()) {
            System.out.println(v);
        }
    }

    private void addVehicle(Scanner scanner) {
        // Logic to add a vehicle will go here
    }

    private void removeVehicle(Scanner scanner) {
        // Logic to remove a vehicle will go here
    }
}
