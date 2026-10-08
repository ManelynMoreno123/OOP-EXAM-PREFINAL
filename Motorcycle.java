/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiclerentalapp;

/**
 *
 * @author User
 */
public class Motorcycle extends Vehicle{
    double dailyRate;
    double helmetFee;

    public Motorcycle(String vehicleID, String brand, String model, int year, int rentalDays, double dailyRate, double helmetFee) {
        super(vehicleID, brand, model, year, rentalDays);
        this.dailyRate = dailyRate;
        this.helmetFee = helmetFee;
    }
    public double calculateRentalFee(){
        double RentalFee = (rentalDays * dailyRate) + helmetFee;
        return RentalFee;
    }
     public void displayvehicleType() {
        System.out.println("Vehicle Type    :  Motorcycle ");
    }
}
