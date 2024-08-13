package com.sgtesting.practice.exception;
class BasicMath
{
    static void add(int x,int y)
    {
        System.out.println("addition result "+(x+y));
    }

    static  void div(int x,int y)
    {
        try {
            System.out.println("div result "+(x/y));
        }
        catch (ArithmeticException e)
        {
            e.printStackTrace();
        }

    }
    static void sub(int x,int y)
    {
        System.out.println("sub result"+(x-y));
    }
}
public class DemoTryCatch {
    public static void main(String[] args) {
        BasicMath2.add(2,3);
        BasicMath2.div(10,0);
        BasicMath2.sub(6,3);


    }

}
