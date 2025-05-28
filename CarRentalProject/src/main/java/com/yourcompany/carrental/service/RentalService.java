package com.yourcompany.carrental.service;

import com.yourcompany.carrental.model.RentalRecord;

public class RentalService {
    public void printRentalSummary(RentalRecord record) {
        System.out.println("Renter: " + record.getRenterName());
        System.out.println("License Plate: " + record.getLicensePlate());
        System.out.println("Total Price: $" + record.getTotalPrice());
    }
}
