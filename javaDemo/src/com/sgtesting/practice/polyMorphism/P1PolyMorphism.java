package com.sgtesting.practice.polyMorphism;
abstract class Animal
{
    abstract void animalSound();
}
class Dog extends Animal
{
    void animalSound()
    {
        String sound="bowwwwwwwww!!!!!!";
        System.out.println("dog sounds like: "+sound);
    }
}
class cat extends Animal
{
    @Override
    void animalSound()
    {
        String sounds="meow!!!!!!";
        System.out.println("cat sounds like: "+sounds);
    }
}

public class P1PolyMorphism {
    public static void main(String[] args) {


        Animal an = null;

        Dog dg = new Dog();
        an = dg;
        an.animalSound();

        cat ct=new cat();
        an=ct;
        an.animalSound();
    }
}
