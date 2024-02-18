package com.company.Entity;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rupali on 2/19/2024.
 */
public class ParkingLot {
    //data memebers
    private int capacity;
    private List<ParkingSlot> slots;
    //constructor
    public ParkingLot(int capacity) {
        this.capacity = capacity;
        this.slots = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            slots.add(new ParkingSlot(i + 1));
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public List<ParkingSlot> getSlots() {
        return slots;
    }

    public void setSlots(List<ParkingSlot> slots) {
        this.slots = slots;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int parkCar(Car car) {
        for (ParkingSlot slot : slots) {
            if (slot.getCar() == null) {
                slot.parkCar(car);
                return slot.getSlotNumber();
            }
        }
        return -1; // Parking lot full
    }

    public void removeCar(int slotNumber) {
        if (slotNumber <= capacity) {
            slots.get(slotNumber - 1).removeCar();
        }
    }

    public List<String> getRegistrationNumbersForColor(String color) {
        List<String> registrationNumbers = new ArrayList<>();
        for (ParkingSlot slot : slots) {
            if (slot.getCar() != null && slot.getCar().getColor().equalsIgnoreCase(color)) {
                registrationNumbers.add(slot.getCar().getRegistrationNumber());
            }
        }
        return registrationNumbers;
    }

    public int getSlotNumberForRegistrationNumber(String registrationNumber) {
        for (ParkingSlot slot : slots) {
            Car car = slot.getCar();
            if (car != null && car.getRegistrationNumber().equalsIgnoreCase(registrationNumber)) {
                return slot.getSlotNumber();
            }
        }
        return -1; // Car not found
    }

    public List<Integer> getSlotNumbersForColor(String color) {
        List<Integer> slotNumbers = new ArrayList<>();
        for (ParkingSlot slot : slots) {
            if (slot.getCar() != null && slot.getCar().getColor().equalsIgnoreCase(color)) {
                slotNumbers.add(slot.getSlotNumber());
            }
        }
        return slotNumbers;
    }

    public void printStatus() {
        System.out.println("Slot No. Registration No Colour");
        for (ParkingSlot slot : slots) {
            Car car = slot.getCar();
            if (car != null) {
                System.out.println(slot.getSlotNumber() + " " + car.getRegistrationNumber() + " " + car.getColor());
            }
        }
    }
}

