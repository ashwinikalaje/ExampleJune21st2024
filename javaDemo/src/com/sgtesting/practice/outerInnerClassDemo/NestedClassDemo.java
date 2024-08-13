package com.sgtesting.practice.outerInnerClassDemo;

class Outer
{
    String fname;
    Inner inn=new Inner();
    void displayage()
    {
        inn.age=26;
        System.out.println("inner class age is:"+inn.age);

    }
    class Inner
    {
        int age;
        void showFn()
        {
            fname="ashwini";
            System.out.println("fname from outer class:"+fname);
        }
    }
}
public class NestedClassDemo {
    public static void main(String[] args) {
        Outer out=new Outer();
        out.displayage();
        out.inn.showFn();//we need create obeject in obeje same as class

    }
}
