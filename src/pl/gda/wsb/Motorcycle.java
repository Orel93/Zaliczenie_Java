package pl.gda.wsb;

import pl.gda.wsb.Vehicle;

public class Motorcycle extends Vehicle {
    double horsepower;

    public Motorcycle(String registration_numbers, String vinNumber, String color, double price, double carCombustion, double fuelTankCondition, double kilometersTraveled){
        super(registration_numbers, vinNumber, color, price, carCombustion, fuelTankCondition, kilometersTraveled);
        this.horsepower = horsepower;
    }
}