package pl.gda.wsb;

import pl.gda.wsb.Vehicle;

public class Motorcycle extends Vehicle {
    Double horsepower;

    public Motorcycle(String registration_numbers, String vinNumber, String color, Double price, Double carCombustion, Double fuelTankCondition, Double kilometersTraveled){
        super(registration_numbers, vinNumber, color, price, carCombustion, fuelTankCondition, kilometersTraveled);
        this.horsepower = horsepower;
    }
}