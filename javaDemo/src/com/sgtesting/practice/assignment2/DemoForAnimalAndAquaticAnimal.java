package com.sgtesting.practice.assignment2;
class Animal
{
    String AnimalName;
    String ScientificName;
    String AnimalType;
    Animal()
    {
        AnimalName="cow";
        ScientificName="Bos taurus";
        AnimalType="domestic animal";

        System.out.println("*********** Animal info **********");
        System.out.println("AnimalName: "+AnimalName);
        System.out.println("ScientificName: "+ScientificName);
        System.out.println("AnimalType: "+AnimalType);

    }
}

class AquaticAnimals {
    String AnimalName;
    String ScientificName;
    String AnimalType;

    AquaticAnimals() {
        AnimalName = "Dolphin";
        ScientificName = "das morphy";
        AnimalType = "water animal";

        System.out.println("*********** Aquatic animal info **********");
        System.out.println("AnimalName: " + AnimalName);
        System.out.println("ScientificName: " + ScientificName);
        System.out.println("AnimalType: " + AnimalType);
    }

    public class DemoForAnimalAndAquaticAnimal {
        public static void main(String args[]) {
            Animal obj1 = new Animal();
            AquaticAnimals obj2 = new AquaticAnimals();

        }
    }
}
