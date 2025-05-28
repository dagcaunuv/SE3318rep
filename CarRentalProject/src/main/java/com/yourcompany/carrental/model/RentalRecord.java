package com.yourcompany.carrental.model;

public class RentalRecord {
    private Car car;
    private String renterName;
    private int rentalDays;

    public RentalRecord(Car car, String renterName, int rentalDays) {
        this.car = car;
        this.renterName = renterName;
        this.rentalDays = rentalDays;
    }

    public double getTotalPrice() {
        return car.calculateDailyPrice() * rentalDays;
    }

    public String getRenterName() {
        return renterName;
    }

    public String getLicensePlate() {
        return car.getLicensePlate();
    }
}
