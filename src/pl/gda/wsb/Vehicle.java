package pl.gda.wsb;

public abstract class Vehicle {

    String registration_numbers;
    String vinNumber;
    String color;
    double price;
    double carCombustion;
    double fuelTankCondition;
    double kilometersTraveled;

    public Vehicle(String registration_numbers, String vinNumber, String color, double price, double carCombustion, double fuelTankCondition, double kilometersTraveled)
    {
    this.registration_numbers = registration_numbers;
    this.vinNumber= vinNumber;
    this.color= color;
    this.price= price;
    this.carCombustion= carCombustion;
    this.fuelTankCondition= fuelTankCondition;
    this.kilometersTraveled= kilometersTraveled;
    }
}
