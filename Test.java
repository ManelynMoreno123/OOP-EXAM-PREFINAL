/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiclerentalapp;

/**
 *
 * @author User
 */
public class Test {
    public static void main(String[] args) {
        
       Vehicle vehicle[] = new Vehicle[3];
        
        Sedan s = new Sedan ("SD-001", "Toyota", "Vios", 2024, 3, 2000, 1000);
        Van v = new Van ("VN-001", "Toyota", "HiAce", 2023, 2, 3000, 500);
        Motorcycle m = new Motorcycle ("MD-001", "MotorAce", "Vios", 2024, 3, 1000, 300);
       
        vehicle[0] = s;
        vehicle[0] = v;
        vehicle[0] = m;
        
        System.out.println("DINA AND GAT RENT A RIDE SERVICE");
        System.out.println("    VEHICLE RENTAL SYSTEM       ");
        System.out.println("================================ ");
        
        s.displayVehicleInfo();
        s.displayvehicleType();
        s.calculateRentalFee();
        System.out.println("");
   
        v.displayVehicleInfo();
        v.displayvehicleType();
        v.calculateRentalFee();
        System.out.println("");
         
        m.displayVehicleInfo();
        m.displayvehicleType();
        m.calculateRentalFee();
        
        for(int i = 0; i < vehicle.length; i++){
            vehicle[i].displayVehicleInfo();
            vehicle[i].calculateRentalFee();
            
        }
         
    }
}

    

