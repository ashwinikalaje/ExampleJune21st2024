package com.sgtesting.practice.inheritanceDemo;
class MathDemo1
{
  void add(int x,int y)
  {
      System.out.println("addtion result:"+(x+y));

  }
}
class MathDemo2 extends MathDemo1
{
    void sub(int a,int b)
    {
        System.out.println("sub result:"+(a-b));

    }
}
class MathDemo3 extends MathDemo2
{
    void multiplication( int p,int q)
    {
        System.out.println("mul result is:"+(p*q));

    }
}


public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        MathDemo3 o=new MathDemo3();
        o.add(3,5);
        o.sub(7,2);
        o.multiplication(6,5);

    }
}
