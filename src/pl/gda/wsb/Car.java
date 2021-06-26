package pl.gda.wsb;

import pl.gda.wsb.Vehicle;

public class Car extends Vehicle {
    double numberOfDors;


    public Car(String registration_numbers, String vinNumber, String color, double price, double carCombustion, double fuelTankCondition, double kilometersTraveled){
        super(registration_numbers, vinNumber, color, price, carCombustion, fuelTankCondition, kilometersTraveled);
        this.numberOfDors = numberOfDors;
    }
}