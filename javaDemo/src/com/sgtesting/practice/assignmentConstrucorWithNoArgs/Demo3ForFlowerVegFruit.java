package com.sgtesting.practice.assignmentConstrucorWithNoArgs;


class Fruits {
    int fruit_price;
    String fruit_name;
    String fruit_taste;
    String fruit_colour;

    Fruits() {
        System.out.println("*******Fruits Deatils ****************");
        fruit_price = 150;
        fruit_name = "apple";
        fruit_colour = "red";
        fruit_taste = "sweet";


        System.out.println("fruit_price: " + fruit_price);
        System.out.println("fruit_name: " + fruit_name);
        System.out.println("fruit_colour " + fruit_colour);
        System.out.println("fruit_taste: " + fruit_taste);
        System.out.println("-----------------------------");


    }

}

class Vegetable {
    String vegetable_name;
    String vegetable_colour;
    int vegetable_price;

    Vegetable() {
        System.out.println("*******Vegetable Deatils ****************");
        vegetable_name = "tomato";
        vegetable_colour = "red";
        vegetable_price = 100;


        System.out.println("vegetable_name: " + vegetable_name);
        System.out.println("vegetable_colour: " + vegetable_colour);
        System.out.println("vegetable_price: " + vegetable_price);


        System.out.println("-----------------------------");

        vegetable_name = "onion";
        vegetable_colour = "brown";
        vegetable_price = 102;


        System.out.println("vegetable_name: " + vegetable_name);
        System.out.println("vegetable_colour: " + vegetable_colour);
        System.out.println("vegetable_price: " + vegetable_price);


    }
}


class Flowers {
    String flowers_type;
    String flowers_name;
    String flowers_colour;
    int flowers_price;

    Flowers() {
        System.out.println("*******flower Details ****************");


        flowers_type = "soft";
        flowers_name = "hibiscus";
        flowers_colour = "white";
        flowers_price = 200;

        System.out.println("flowers_type: " + flowers_type);
        System.out.println("flowers_name: " + flowers_name);
        System.out.println("flowers_colour: " + flowers_colour);
        System.out.println("flowers_price: " + flowers_price);

        System.out.println("------------------------------------");

        flowers_type = "soft";
        flowers_name = "rose";
        flowers_colour = "pink";
        flowers_price = 100;

        System.out.println("flowers_type: " + flowers_type);
        System.out.println("flowers_name: " + flowers_name);
        System.out.println("flowers_colour: " + flowers_colour);
        System.out.println("flowers_price: " + flowers_price);


    }
}


public class Demo3ForFlowerVegFruit {
    public static void main(String[] args) {
        Fruits obj1 = new Fruits();
        Vegetable obj2 = new Vegetable();
        Flowers obj3 = new Flowers();
    }

}
