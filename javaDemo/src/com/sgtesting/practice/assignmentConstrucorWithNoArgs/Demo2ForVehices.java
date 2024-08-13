package com.sgtesting.practice.assignmentConstrucorWithNoArgs;


class TwoWheeler {
    String vehicleName;
    String bodyType;
    String vehicle_colour;
    int vehicle_price;
    int fuelCapacity;

    TwoWheeler() {

        vehicleName = "pulser 250";
        bodyType = "sports bike";
        vehicle_colour = "black";
        vehicle_price = 200000;
        fuelCapacity = 141;

        System.out.println("*********** Two vehicle names***********************");
        System.out.println("vehicleName: " + vehicleName);
        System.out.println("bodyType: " + bodyType);
        System.out.println("vehicle_colour: " + vehicle_colour);
        System.out.println("fuelCapacity: " + fuelCapacity);
        System.out.println("----------------------------------");


        vehicleName = " Honda Activa";
        bodyType = "scooter";
        vehicle_colour = "white";
        vehicle_price = 80000;
        fuelCapacity = 53;

        System.out.println("vehicleName: " + vehicleName);
        System.out.println("bodyType: " + bodyType);
        System.out.println("vehicle_colour: " + vehicle_colour);
        System.out.println("fuelCapacity: " + fuelCapacity);
    }


}

class Four_wheeler {
    String carType;
    String carName;
    String carColour;
    int carPrice;

    Four_wheeler() {
        System.out.println("**********************four_wheeler***********************");


        carType = "sedon";
        carName = "honda city";
        carColour = "black";
        carPrice = 280000;


        System.out.println("carType: " + carType);
        System.out.println("carName: " + carName);
        System.out.println("carColour: " + carColour);
        System.out.println("carPrice: " + carPrice);
        System.out.println("----------------------------------");


        carType = "hatch back";
        carName = "i20";
        carColour = "red";
        carPrice = 900000;


        System.out.println("carType: " + carType);
        System.out.println("carName: " + carName);
        System.out.println("carColour: " + carColour);
        System.out.println("carPrice: " + carPrice);
        System.out.println("----------------------------------");

    }
}

class HeavyVehicle {
    String vehicleName;
    String vehicleType;
    String vehicle_price;

    HeavyVehicle() {
        System.out.println("********* heavy vehicle type ******************");
        vehicleName = "truck";
        vehicleType = "goods";
        vehicle_price = "500000";


        System.out.println("vehicleName: " + vehicleName);
        System.out.println("vehicleType: " + vehicleType);
        System.out.println("vehicle_price: " + vehicle_price);

        System.out.println("----------------------------------");


        vehicleName = "bus";
        vehicleType = "transport";
        vehicle_price = "7000000";


        System.out.println("vehicleName: " + vehicleName);
        System.out.println("vehicleType: " + vehicleType);
        System.out.println("vehicle_price: " + vehicle_price);

        System.out.println("----------------------------------");


    }
}

public class Demo2ForVehices {
    public static void main(String[] args) {


        TwoWheeler obj1 = new TwoWheeler();
        Four_wheeler obj2 = new Four_wheeler();
        HeavyVehicle obj3 = new HeavyVehicle();
    }
}