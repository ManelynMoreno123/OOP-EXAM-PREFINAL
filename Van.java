/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiclerentalapp;

/**
 *
 * @author User
 */
public class Van extends Vehicle {
    double dailyRate;
    double driversFee;

    public Van(String vehicleID, String brand, String model, int year, int rentalDays, double dailyRate, double driversFee) {
        super(vehicleID, brand, model, year, rentalDays);
        this.dailyRate = dailyRate;
        this.driversFee = driversFee;
    }
    
    public double calculateRentalFee() {
        double rentalFee = (rentalDays * dailyRate) + driversFee;
        return rentalFee;
    }
    
    public void displayvehicleType() {
        System.out.println("Vehicle Type    :  Van ");
    }
    
    
    
}
