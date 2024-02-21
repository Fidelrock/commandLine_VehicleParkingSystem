/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asimpleparkingmanagementsystem;

import Vehicle;

/**
 *
 * @author DELL
 */
public class Slot {
      String type;
    Vehicle vehicle;
    String ticketId;

    public Slot(String type) {
        this.type = type;
        this.vehicle = null;
        this.ticketId = null;
    }
}