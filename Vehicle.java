/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiclerentalapp;

/**
 *
 * @author User
 */
public abstract class Vehicle {
    String vehicleID;
    String brand;
    String model;
    int year;
    int rentalDays;
    static int vehicleCount;

    public Vehicle(String vehicleID, String brand, String model, int year, int rentalDays) {
        this.vehicleID = vehicleID;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.rentalDays = rentalDays;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }
    
    public abstract double calculateRentalFee();
    
    public void displayVehicleInfo() {
        System.out.println("Vehicle ID      :   " + vehicleID);
        System.out.println("Vehicle Brand   :   " + brand);
        System.out.println("Vehicle Model   :   " + model);
        System.out.println("Year            :   " + year);
        System.out.println("Rental Days     :   " + rentalDays);
    }
    
    public static int getVehicleCount(){
        return vehicleCount;
    } 
    
}
