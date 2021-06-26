package pl.gda.wsb;

import pl.gda.wsb.Vehicle;

public class Car extends Vehicle {
    Double numberOfDors;


    public Car(String registration_numbers, String vinNumber, String color, Double price, Double carCombustion, Double fuelTankCondition, Double kilometersTraveled){
        super(registration_numbers, vinNumber, color, price, carCombustion, fuelTankCondition, kilometersTraveled);
        this.numberOfDors = numberOfDors;
    }
}