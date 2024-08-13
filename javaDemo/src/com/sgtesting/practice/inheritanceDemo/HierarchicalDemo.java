package com.sgtesting.practice.inheritanceDemo;

class ParentDemo
{
    void add(int x,int y)
    {
        System.out.println("addtion result:"+(x+y));

    }
}
class Child1Demo extends ParentDemo
{
    void sub(int a,int b)
    {
        System.out.println("sub result:"+(a-b));

    }
}
class Child2Demo extends ParentDemo
{
    void multiplication( int p,int q)
    {
        System.out.println("mul result is:"+(p*q));

    }
}

public class HierarchicalDemo {
    public static void main(String[] args) {


        Child1Demo o = new Child1Demo();
        o.add(2,5);
        o.sub(5,2);

        Child2Demo ch=new Child2Demo();
        ch.add(2,8);
        ch.multiplication(6,3);
    }
}
