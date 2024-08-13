//There are 2 classes Demo1 and Demo2, Demo1 contains instance method and Demo2 contains
//instance method. Can we execute instance method of Demo2 inside the instance method of Demo1
package com.sgtesting.practice.staticMembers;
class Demo1NewSample
{
    void display(String fanme)
    {
        Demo2NewSample dm=new Demo2NewSample();
        dm.displayAge(12);


        System.out.println("fanme: "+fanme);
    }

}
class Demo2NewSample
{
    void displayAge(int age)
    {

        System.out.println("age: "+age);
    }
}
public class Scenario3BothAreInstance {
    public static void main(String[] args) {
        Demo1NewSample dm2=new Demo1NewSample();
        dm2.display("ashu");
    }

}
