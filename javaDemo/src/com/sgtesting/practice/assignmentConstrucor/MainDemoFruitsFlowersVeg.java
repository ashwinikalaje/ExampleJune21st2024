//create class fruits flowers,veggitable,and execute each memebers of the class

package com.sgtesting.practice.assignmentConstrucor;


class Fruits
{
    int fruit_price;
    String fruit_name;
    String fruit_taste;
    String fruit_colour;


}
class Vegetable
{
    String vegetable_name;
    String vegetable_colour;
    int vegetable_price;


}
class Flowers
{
    String flowers_type;
    String flowers_name;
    String flowers_colour;
    int flowers_price;
}




public class MainDemoFruitsFlowersVeg {
    public static void main(String args[]) {
        Fruits obj1 = new Fruits();
        System.out.println("*******Fruits Deatils ****************");
        obj1.fruit_price = 150;
        obj1.fruit_name="apple";
        obj1.fruit_colour="red";
        obj1.fruit_taste="sweet";



        System.out.println("fruit_price: "+obj1.fruit_price);
        System.out.println("fruit_name: "+obj1.fruit_name);
        System.out.println("fruit_colour "+obj1.fruit_colour);
        System.out.println("fruit_taste: "+obj1.fruit_taste);
        System.out.println("-----------------------------");



        System.out.println("*******Vegetable Deatils ****************");
        Vegetable obj2 = new Vegetable();
        obj2.vegetable_name = "tomato";
        obj2.vegetable_colour="red";
        obj2.vegetable_price=100;


        System.out.println("vegetable_name: "+obj2.vegetable_name);
        System.out.println("vegetable_colour: "+obj2.vegetable_colour);
        System.out.println("vegetable_price: "+obj2.vegetable_price);


        System.out.println("-----------------------------");

        Vegetable obj3 = new Vegetable();
        obj3.vegetable_name = "onion";
        obj3.vegetable_colour="brown";
        obj3.vegetable_price=102;


        System.out.println("vegetable_name: "+obj3.vegetable_name);
        System.out.println("vegetable_colour: "+obj3.vegetable_colour);
        System.out.println("vegetable_price: "+obj3.vegetable_price);



        System.out.println("*******flower Details ****************");


        Flowers obj5=new Flowers();
        obj5.flowers_type="soft";
        obj5.flowers_name="hibiscus";
        obj5.flowers_colour="white";
        obj5.flowers_price=200;

        System.out.println("flowers_type: "+obj5.flowers_type);
        System.out.println("flowers_name: "+obj5.flowers_name);
        System.out.println("flowers_colour: "+obj5.flowers_colour);
        System.out.println("flowers_price: "+obj5.flowers_price);

System.out.println("------------------------------------");
        Flowers obj6=new Flowers();
        obj6.flowers_type="soft";
        obj6.flowers_name="rose";
        obj6.flowers_colour="pink";
        obj6.flowers_price=100;

        System.out.println("flowers_type: "+obj6.flowers_type);
        System.out.println("flowers_name: "+obj6.flowers_name);
        System.out.println("flowers_colour: "+obj6.flowers_colour);
        System.out.println("flowers_price: "+obj6.flowers_price);







    }

}

