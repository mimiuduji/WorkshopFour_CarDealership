package com.ps;

import java.io.*;
import java.util.ArrayList;

public class DealershipFileManager {

    public Dealership getDealership(String filename) {
        Dealership dealership = null;
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line = br.readLine();
            if (line != null) {
                String[] dealershipInfo = line.split("\\|");
                dealership = new Dealership(dealershipInfo[0], dealershipInfo[1], dealershipInfo[2]);
            }

            while ((line = br.readLine()) != null) {
                String[] vehicleInfo = line.split("\\|");
                Vehicle vehicle = new Vehicle(vehicleInfo[0], vehicleInfo[1], vehicleInfo[2], vehicleInfo[3],
                        Integer.parseInt(vehicleInfo[4]), Integer.parseInt(vehicleInfo[5]),
                        Double.parseDouble(vehicleInfo[6]));
                dealership.addVehicle(vehicle);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
        return dealership;
    }

    public void saveDealership(Dealership dealership, String filename) {
        // Code to save dealership inventory to the file goes here
    }
}

