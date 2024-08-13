package com.sgtesting.practice.polyMorphism;
abstract class Transport
{
    abstract void move();
    {

    }
}
class Car extends Transport
{
    void move()
    {
        System.out.println("The car is driving on the road");
    }
}

class Bicycle extends Transport
{
    void move()
    {
        System.out.println("The Bicycle is  on the road");
    }
}
class Bus extends Transport
{
    void move()
    {
        System.out.println("The Bus is  on the road");
    }
}


public class P1PolyEx3 {
    public static void main(String[] args)
    {

        Transport transport = null;
        Bicycle bi = new Bicycle();
        Car ca = new Car();
        Bus bu = new Bus();

        transport = bi;
        transport.move();

        transport = ca;
        transport.move();

        transport = bu;
        transport.move();

    }


}
