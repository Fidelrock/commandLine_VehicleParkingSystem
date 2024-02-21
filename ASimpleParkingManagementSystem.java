/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asimpleparkingmanagementsystem;
/**
 *
 * @author DELL
 * 
 * 
 */
import java.util.Scanner;

public class ASimpleParkingManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String [] args){

        int nFloors = 4;
        int nSlotsPerFloor = 6;
        ParkingLot parkingLot = new ParkingLot("PR1234", nFloors, nSlotsPerFloor);
 int choice;
        do{
        
       
        System.out.println("1. Park Vehicle");
        System.out.println("2. Un Park Vehicle");
        
        System.out.println("Hello, Enter a number below for your action");
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();
        
//        System.out.println("1. Park Vehicle");
//        System.out.println("1. Park Vehicle");

        switch(choice){
            case 1: 
                String vehicleType;
                System.out.println("Enter the type of vehicle to park: ");
                vehicleType = scanner.next();
                parkingLot.displayOpenSlots(vehicleType);
                
                String numberPlate, vehicleColor;
                System.out.println("Enter numberPlate: ");
                numberPlate = scanner.next();
                System.out.println("Enter vehicle color: ");
                vehicleColor = scanner.next();
                parkingLot.parkVehicle(vehicleType, numberPlate, vehicleColor);
                
        break;
        
            case 2:
                System.out.println("You chose to un park your vehicle.");
        break;
        
            default: 
        System.out.println("Invalid Choice. Please Try Again!!!");
        }}while(choice>=3);
       
    }
}


