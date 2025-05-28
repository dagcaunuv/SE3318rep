package com.yourcompany.carrental.model;


public abstract class Car {
    protected String brand;
    protected String model;
    protected String licensePlate;

    public Car(String brand, String model, String licensePlate) {
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
    }

    public abstract double calculateDailyPrice();

    public String getLicensePlate() {
        return licensePlate;
    }
}
