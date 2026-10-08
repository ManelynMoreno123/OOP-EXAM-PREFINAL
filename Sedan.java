/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiclerentalapp;

/**
 *
 * @author User
 */
public class Sedan extends Vehicle {
    
    double dailyRate;
    double insuranceFee;

    public Sedan(String vehicleID, String brand, String model, int year, int rentalDays, double dailyRate, double insuranceFee) {
        super(vehicleID, brand, model, year, rentalDays);
        this.dailyRate = dailyRate;
        this.insuranceFee = insuranceFee;
    }
    public double calculateRentalFee(){
        
        double rentalFee = ( rentalDays * dailyRate) + insuranceFee;
       
    return rentalFee;
    }
    
    public void displayvehicleType() {
        System.out.println("Vehicle Type    :  Sedan ");
    }
    
    
}
