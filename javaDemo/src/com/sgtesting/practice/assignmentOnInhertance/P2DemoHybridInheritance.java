
package com.sgtesting.practice.assignmentOnInhertance;

class Parent
{
    void add(int x,int y)
    {
        System.out.println("addtion result:"+(x+y));

    }
}
class Child1 extends Parent
{
    void sub(int a,int b)
    {
        System.out.println("sub result:"+(a-b));

    }
}
class Child2 extends Parent
{
    void multiplication( int p,int q)
    {
        System.out.println("mul result is:"+(p*q));

    }
}

class GrandChild extends Child2
{
    void div(int l,int m )
    {
        System.out.println("div result: "+(l/m));
    }
}


public class P2DemoHybridInheritance  {
    public static void main(String[] args) {
   GrandChild Gh=new GrandChild();
        Gh.multiplication(3,2);
        Gh.div(5,2);
        Gh.add(4,7);

       Child1 ch=new Child1();
        ch.sub(5,2);
        ch.add(3,2);
    }
}

