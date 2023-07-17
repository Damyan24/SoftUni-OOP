package Polymorphism.Vehicles;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] carInfo = scan.nextLine().split(" ");
        String [] truckInfo = scan.nextLine().split(" ");
        String [] busInfo = scan.nextLine().split(" ");

        Car car = new Car(Double.parseDouble(carInfo[1]),Double.parseDouble(carInfo[2]),Integer.parseInt(carInfo[3]));
        Truck truck = new Truck(Double.parseDouble(truckInfo[1]),Double.parseDouble(truckInfo[2]),Integer.parseInt(truckInfo[3]));
        Bus bus = new Bus(Double.parseDouble(busInfo[1]),Double.parseDouble(busInfo[2]),Integer.parseInt(busInfo[3]));
        int numberOfCommands = Integer.parseInt(scan.nextLine());



        for(int i = 0 ; i < numberOfCommands; i++){
            String [] tokens = scan.nextLine().split(" ");
            String vehicleType = tokens[1];

            switch (vehicleType){
                case "Car":
                    if(tokens[0].equals("Drive")){
                        System.out.println(car.Drive(Double.parseDouble(tokens[2])));
                    }else if(tokens[0].equals("Refuel")){
                        car.Refuel(Double.parseDouble(tokens[2]));
                    }
                    break;
                case "Truck":
                    if(tokens[0].equals("Drive")){
                        System.out.println(truck.Drive(Double.parseDouble(tokens[2])));
                    }else if(tokens[0].equals("Refuel")){
                        truck.Refuel(Double.parseDouble(tokens[2]));
                    }
                    break;
                case "Bus":
                    if(tokens[0].equals("Drive")){
                        System.out.println(bus.Drive(Double.parseDouble(tokens[2])));
                    }else if(tokens[0].equals("Refuel")){
                        bus.Refuel(Double.parseDouble(tokens[2]));
                    }else if(tokens[0].equals("DriveEmpty")){
                        System.out.println(bus.DriveEmpty(Double.parseDouble(tokens[2])));
                    }
                    break;
            }



        }

        System.out.printf("Car: %.2f\n" , car.getFuelQuantity());
        System.out.printf("Truck: %.2f\n",truck.getFuelQuantity());
        System.out.printf("Bus: %.2f\n",bus.getFuelQuantity());

    }
}
