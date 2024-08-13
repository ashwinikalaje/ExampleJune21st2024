package com.sgtesting.practice.assignmentOnInhertance;


class MathDemo1Parent
{
    void add(int x,int y)
    {
        System.out.println("addtion result:"+(x+y));

    }

    void sub(int x,int y,int z)
    {
        System.out.println("subtarction result:"+(x-y-z));

    }
    void mul(int x,int y,int p,int q)
    {
        System.out.println("multiplication result:"+(x*y*p*q));

    }
}
class MathDemo2Child extends MathDemo1Parent
{
    void add(int xOfChild2,int yOfChild2)
    {
        super.add(xOfChild2,yOfChild2);
    }

    void sub(int xOfChild2,int yOfChild2,int zOfChild2)
    {
      super.sub(xOfChild2,yOfChild2,zOfChild2);
    }

    void mul(int xOfChild2,int yOfChild2,int pOfChild2,int qOfChild2)
    {
        super.mul(xOfChild2,yOfChild2,pOfChild2,qOfChild2);
    }
}
class MathDemo3Child extends MathDemo2Child
{
    void add(int xOfChild3,int yOfChild3)
    {
        super.add(xOfChild3,yOfChild3);
    }

    void sub(int xOfChild3,int yOfChild3,int zOfChild3)
    {
        super.sub(xOfChild3,yOfChild3,zOfChild3);
    }

    void mul(int xOfChild3,int yOfChild3,int pOfChild3,int qOfChild3)
    {
        super.mul(xOfChild3,yOfChild3,pOfChild3,qOfChild3);
    }
}


public class P7DemoMulilevelSameClass {
    public static void main(String[] args) {
        MathDemo3Child o=new MathDemo3Child();
        o.add(2,5);
        o.sub(6,2,1);
        o.mul(3,2,2,3);


    }
}
