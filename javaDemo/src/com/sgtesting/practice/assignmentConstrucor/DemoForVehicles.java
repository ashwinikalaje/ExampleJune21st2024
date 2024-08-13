//create class two-wheeler,four-wheeler,heavy-vehicles
package com.sgtesting.practice.assignmentConstrucor;


class TwoWheeler
    {
        String vehicleName;
        String bodyType;
        String vehicle_colour;
        int vehicle_price;
        int fuelCapacity;


    }
    class Four_wheeler
    {
        String carType;
        String carName;
         String carColour;
        int carPrice;
    }
    class HeavyVehicle
    {
        String vehicleName;
        String vehicleType;
        String vehicle_price;
    }
public class DemoForVehicles
{
    public static void main(String args[])
    {
        TwoWheeler obj1=new TwoWheeler();
        obj1.vehicleName="pulser 250";
        obj1.bodyType="sports bike";
        obj1.vehicle_colour="black";
        obj1.vehicle_price=200000;
        obj1.fuelCapacity=141;

        System.out.println("***********v two wheeler ehicle names***********************");
        System.out.println("vehicleName: "+obj1.vehicleName);
        System.out.println("bodyType: "+obj1.bodyType);
        System.out.println("vehicle_colour: "+obj1.vehicle_colour);
        System.out.println("fuelCapacity: "+obj1.fuelCapacity);
        System.out.println("----------------------------------");

        TwoWheeler obj2=new TwoWheeler();
        obj2.vehicleName=" Honda Activa";
        obj2.bodyType="scooter";
        obj2.vehicle_colour="white";
        obj2.vehicle_price=80000;
        obj2.fuelCapacity=53;

        System.out.println("vehicleName: "+obj2.vehicleName);
        System.out.println("bodyType: "+obj2.bodyType);
        System.out.println("vehicle_colour: "+obj2.vehicle_colour);
        System.out.println("fuelCapacity: "+obj2.fuelCapacity);

        System.out.println("**********************four_wheeler***********************");

        Four_wheeler obj3=new Four_wheeler();
        obj3.carType="sedon";
        obj3.carName="honda city";
        obj3.carColour="black";
        obj3.carPrice=280000;



        System.out.println("carType: "+obj3.carType);
        System.out.println("carName: "+obj3.carName);
        System.out.println("carColour: "+obj3.carColour);
        System.out.println("carPrice: "+obj3.carPrice);
        System.out.println("----------------------------------");

        Four_wheeler obj4=new Four_wheeler();
        obj4.carType="hatch back";
        obj4.carName="i20";
        obj4.carColour="red";
        obj4.carPrice=900000;



        System.out.println("carType: "+obj4.carType);
        System.out.println("carName: "+obj4.carName);
        System.out.println("carColour: "+obj4.carColour);
        System.out.println("carPrice: "+obj4.carPrice);
        System.out.println("----------------------------------");

        System.out.println("********* heavy vehicle type ******************");


        HeavyVehicle obj5=new HeavyVehicle();
        obj5.vehicleName="truck";
        obj5.vehicleType="goods";
        obj5.vehicle_price="500000";


        System.out.println("vehicleName: "+obj5.vehicleName);
        System.out.println("vehicleType: "+obj5.vehicleType);
        System.out.println("vehicle_price: "+obj5.vehicle_price);

        System.out.println("----------------------------------");

        HeavyVehicle obj6=new HeavyVehicle();
        obj6.vehicleName="bus";
        obj6.vehicleType="transport";
        obj6.vehicle_price="7000000";




        System.out.println("vehicleName: "+obj6.vehicleName);
        System.out.println("vehicleType: "+obj6.vehicleType);
        System.out.println("vehicle_price: "+obj6.vehicle_price);

        System.out.println("----------------------------------");









    }


}
