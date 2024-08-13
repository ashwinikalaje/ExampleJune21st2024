package com.sgtesting.practice.inheritanceDemo;
class math1
{
    void addition(int x,int y)
    {
        System.out.println("addition result: "+(x+y));

    }

}
class math2 extends math1
{

    void substraction(int a,int b)
    {

        System.out.println("substarction result:"+(a-b));
    }
}
public class SingleInheritanceDemo {
    public static void main(String[] args) {
        math2 o=new math2();
       o.addition(2,4);
        o.substraction(4,2);

    }
}
