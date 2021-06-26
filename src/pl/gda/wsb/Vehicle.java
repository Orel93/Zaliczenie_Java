package pl.gda.wsb;

public abstract class Vehicle {

    String registration_numbers;
    String vin_number;
    String color;
    double price;
    double carCombustion;
    double fuelTankCondition;
    double kilometersTraveled;

    public Vehicle(String registration_numbers, String vin_number, String color, double price, double carCombustion, double fuelTankCondition, double kilometersTraveled)
    {
    this.registration_numbers = registration_numbers;
    this.vin_number= vin_number;
    this.color= color;
    this.price= price;
    this.carCombustion= carCombustion;
    this.fuelTankCondition= fuelTankCondition;
    this.kilometersTraveled= kilometersTraveled;
    }

    public class Car extends Vehicle{

        public Car(String registration_numbers, String vin_number, String color, double price, double carCombustion, double fuelTankCondition, double kilometersTraveled){
            super(registration_numbers, vin_number, color, price, carCombustion, fuelTankCondition, kilometersTraveled);
        }
    }
    public class Truck extends Vehicle{

        public Truck(String registration_numbers, String vin_number, String color, double price, double carCombustion, double fuelTankCondition, double kilometersTraveled){
            super(registration_numbers, vin_number, color, price, carCombustion, fuelTankCondition, kilometersTraveled);
        }
    }
    public class Motorcycle extends Vehicle{

        public Motorcycle(String registration_numbers, String vin_number, String color, double price, double carCombustion, double fuelTankCondition, double kilometersTraveled){
            super(registration_numbers, vin_number, color, price, carCombustion, fuelTankCondition, kilometersTraveled);
        }
    }

}
