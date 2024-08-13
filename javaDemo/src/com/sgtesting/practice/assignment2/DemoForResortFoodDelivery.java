package com.sgtesting.practice.assignment2;

class Resort
{
    String resort_Name;
    String resort_location;
    String ratings;
    String resort_type;
    Resort()
    {
        resort_Name="Ozone";
        resort_location="dharwad";
        ratings="5 star";
        resort_type="family Restaurant";

        System.out.println("*********** resort info ***********");
        System.out.println("resort_Name: "+resort_Name);
        System.out.println("resort_location: "+resort_location);
        System.out.println("resort_type: "+resort_type);

        System.out.println("----------------------------------");

        resort_Name="president";
        resort_location="hubbli";
        ratings="4.5 star";
        resort_type="family Restaurant";

        System.out.println("*********** resort info ***********");
        System.out.println("resort_Name: "+resort_Name);
        System.out.println("resort_location: "+resort_location);
        System.out.println("resort_type: "+resort_type);




    }
}
class FoodDelivery
{
    String foodDeliveryRestaurantName;
    String delivery_location;
    String ratings;

    FoodDelivery()
    {
        foodDeliveryRestaurantName="swiggy";
        delivery_location="banglore";
        ratings="4.5 star";

        System.out.println("*********** resort info ***********");
        System.out.println("foodDeliveryRestaurantName: "+foodDeliveryRestaurantName);
        System.out.println("delivery_location: "+delivery_location);
        System.out.println("ratings: "+ratings);


    }
}
public class DemoForResortFoodDelivery {
    public static void main(String[] args) {
        Resort obj1=new Resort();
        FoodDelivery obj2=new FoodDelivery();


    }
}
