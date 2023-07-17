package Polymorphism.Vehicles;


import java.text.DecimalFormat;

public class Bus extends Vehicle {


    private boolean isEmpty;

    public Bus(double fuelQuantity, double literPerKm, int tankCapacity) {
        super(fuelQuantity, literPerKm + 1.4, tankCapacity);
    }

    public String Drive(double km) {
        if (isEmpty){
            super.setLiterPerKm(super.getLiterPerKm() + 1.4);
            isEmpty = false;
        }
        double fuelNeeded = km * this.getLiterPerKm();
        if(fuelNeeded > this.getFuelQuantity()){
            return this.getClass().getSimpleName() + " needs refueling";
        }

        this.setFuelQuantity(this.getFuelQuantity() - fuelNeeded);
        DecimalFormat format = new DecimalFormat("##.##");
        return String.format("%s travelled %s km",this.getClass().getSimpleName(),format.format(km));
    }




    public String DriveEmpty(double km) {
        if(!isEmpty){
            super.setLiterPerKm(super.getLiterPerKm() - 1.4);
            isEmpty = true;
        }
       return super.Drive(km);
    }



}
