package com.yourcompany.carrental;

import com.yourcompany.carrental.model.*;
import com.yourcompany.carrental.service.RentalService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SmokeTest {

    @Test
    public void testLuxuryCarRental() {
        Car car = new LuxuryCar("BMW", "X5", "ABC123", true, true);
        RentalRecord record = new RentalRecord(car, "John Doe", 2);
        System.out.println("LuxuryCar total price: " + record.getTotalPrice());
        assertEquals(300.0, record.getTotalPrice());
    }

    @Test
    public void testEconomyCarRental() {
        Car car = new EconomyCar("Toyota", "Prius", "XYZ789", true);
        RentalRecord record = new RentalRecord(car, "Jane Smith", 3);
        System.out.println("EconomyCar total price: " + record.getTotalPrice());
        assertEquals(180.0, record.getTotalPrice());
    }
}
