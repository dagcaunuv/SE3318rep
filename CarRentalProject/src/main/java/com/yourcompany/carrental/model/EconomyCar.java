package com.yourcompany.carrental.model;

public class EconomyCar extends Car {
    private boolean isHybrid;

    public EconomyCar(String brand, String model, String licensePlate, boolean isHybrid) {
        super(brand, model, licensePlate);
        this.isHybrid = isHybrid;
    }

    @Override
    public double calculateDailyPrice() {
        double price = 50.0;
        if (isHybrid) price += 10.0;
        return price;
    }
}
