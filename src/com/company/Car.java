package com.company;

public class Car {
    private String manufacturer;
    private String brand;
    private int year;
    private int maxSpeed;

    public String getManufacturer(){
        return manufacturer;
    }

    public void setManufacturer(String carManufacturer) {
        manufacturer = carManufacturer;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }

    public void setMaxSpeed(int carMaxSpeed) {
        maxSpeed = carMaxSpeed;
    }
}
