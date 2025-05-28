package com.yourcompany.carrental.model;



public class LuxuryCar extends Car {
    private boolean hasGps;
    private boolean hasLeatherSeats;

    public LuxuryCar(String brand, String model, String licensePlate, boolean hasGps, boolean hasLeatherSeats) {
        super(brand, model, licensePlate);
        this.hasGps = hasGps;
        this.hasLeatherSeats = hasLeatherSeats;
    }

    @Override
    public double calculateDailyPrice() {
        double price = 100.0;
        if (hasGps) price += 20.0;
        if (hasLeatherSeats) price += 30.0;
        return price;
    }
}
