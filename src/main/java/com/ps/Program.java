package com.ps;

public class Program {
    public static void main(String[] args) {
        DealershipFileManager fileManager = new DealershipFileManager();
        Dealership dealership = fileManager.getDealership("inventory.csv");

        UserInterface ui = new UserInterface(dealership);
        ui.displayMenu();
    }
}
