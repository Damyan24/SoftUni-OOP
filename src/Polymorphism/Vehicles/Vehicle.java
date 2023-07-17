package Polymorphism.Vehicles;

import java.text.DecimalFormat;

public abstract class Vehicle {

    private double fuelQuantity;
    private double literPerKm;
    private int tankCapacity;


    public Vehicle(double fuelQuantity, double literPerKm, int tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.literPerKm = literPerKm;
        this.tankCapacity = tankCapacity;
    }


    public String Drive(double km) {


           {

                double fuelNeeded = km * this.getLiterPerKm();
                if (fuelNeeded > this.getFuelQuantity()) {
                    return this.getClass().getSimpleName() + " needs refueling";
                }

                this.setFuelQuantity(this.getFuelQuantity() - fuelNeeded);
                DecimalFormat format = new DecimalFormat("##.##");
                return String.format("%s travelled %s km", this.getClass().getSimpleName(), format.format(km));
            }
        }



    void Refuel(double liters) {
        if(liters <= 0){
            System.out.println("Fuel must be a positive number");
        }else {
            if (fuelQuantity + liters <= tankCapacity) {
                this.setFuelQuantity(this.getFuelQuantity() + liters);
            } else {
                System.out.println("Cannot fit fuel in tank");
            }
        }
    }


    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public void setLiterPerKm(double literPerKm) {
        this.literPerKm = literPerKm;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public double getLiterPerKm() {
        return literPerKm;
    }
    }


