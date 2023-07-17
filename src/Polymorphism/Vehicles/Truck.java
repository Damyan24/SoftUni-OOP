package Polymorphism.Vehicles;



public class Truck extends Vehicle {
    public Truck(double fuelQuantity, double literPerKm,int tankCapacity) {
        super(fuelQuantity, literPerKm+1.6,tankCapacity);
    }





    @Override
    void Refuel(double liters) {
       super.Refuel(liters * 0.95);
    }


}
