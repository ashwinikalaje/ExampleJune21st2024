package com.sgtesting.practice.assignment2;

class NationalPark
{
    String NationalPark_name;
    String location;
    String entryFees;
    String ageLimit;
    NationalPark()
    {
        NationalPark_name="Anshi park";
        location="dandeli";
        entryFees="200";
        ageLimit=" above 5years";

        System.out.println("*********** NationalPark info **********");
        System.out.println("NationalPark_name: "+NationalPark_name);
        System.out.println("location: "+location);
        System.out.println("entryFees: "+entryFees);
        System.out.println("ageLimit: "+ageLimit);


    }
}
class WaterPark
{
    String WaterParkName;
    String location;
    String entryFees;
    String ageLimit;
    WaterPark()
    {
        WaterParkName="wonderla";
        location="banglore";
        entryFees="1000";
        ageLimit="above 10 years";

        System.out.println("*********** water info **********");
        System.out.println("WaterParkName: "+WaterParkName);
        System.out.println("location: "+location);
        System.out.println("entryFees: "+entryFees);
        System.out.println("ageLimit: "+ageLimit);


    }
}

public class DemoForNationalParkAndWonderlla {
    public static void main(String[] args) {
        NationalPark obj1=new NationalPark();
        WaterPark obj2=new WaterPark();

    }
}
