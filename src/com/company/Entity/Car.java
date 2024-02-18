package com.company.Entity;

/**
 * Created by Rupali on 2/19/2024.
 */
public class Car {private String registrationNumber;
    private String color;

    public Car(String registrationNumber, String color) {
        this.registrationNumber = registrationNumber;
        this.color = color;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getColor() {
        return color;
    }

}
