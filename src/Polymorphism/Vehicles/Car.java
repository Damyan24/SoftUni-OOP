package Polymorphism.Vehicles;



public class Car extends Vehicle {
    public Car(double fuelQuantity, double literPerKm,int tankCapacity) {
        super(fuelQuantity, literPerKm + 0.9,tankCapacity);
    }






}
